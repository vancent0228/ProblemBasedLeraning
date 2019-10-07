package Lesson001.Chapter06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class Ex6_9 {
	public static void main(String[] args) {
		myKeyPair adam = new myKeyPair();
		try {
			String path = ".";
			// Generate the key pair (public key and private key)
			KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
			SecureRandom random = new SecureRandom();
			// 給與亂數因子，指定鑰匙長度，再產生鑰匙
			System.out.println("產生RSA錀匙配對中");
			random.setSeed("seedValue".getBytes());
			keygen.initialize(1024, random); // Generate 1024-bit keys
			KeyPair generatedKeyPair = keygen.generateKeyPair();
			// 儲存錀匙配對
			System.out.println("將錀匙配對寫入檔案，並顯示於螢幕");
			adam.dumpKeyPair(generatedKeyPair); // print the generated keys
			adam.SaveKeyPair(path, generatedKeyPair); // Store the keys into two files
			// 讀取錀匙配對
			System.out.println("\n由檔案讀出 RAS 錀匙配對，並顯示於螢幕");
			KeyPair loadedKeyPair = adam.LoadKeyPair(path, "RSA"); // load the keys from files
			adam.dumpKeyPair(loadedKeyPair);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

}

class myKeyPair {
	// 列印錀匙配對方法
	public void dumpKeyPair(KeyPair keyPair) {
		PublicKey pub = keyPair.getPublic();
		System.out.println("Public Key: " + getHexString(pub.getEncoded()));

		PrivateKey priv = keyPair.getPrivate();
		System.out.println("Private Key: " + getHexString(priv.getEncoded()));
	}

	public String getHexString(byte[] b) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < b.length; i++)
			result.append(Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1));
		return result.toString();
	}

	// 將錀匙配對寫入檔案方法
	public void SaveKeyPair(String path, KeyPair keyPair) throws IOException {
		PrivateKey privateKey = keyPair.getPrivate();
		PublicKey publicKey = keyPair.getPublic();

		// 儲存公開錀匙
		X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());
		FileOutputStream fos = new FileOutputStream(path + "/public.key");
		fos.write(x509EncodedKeySpec.getEncoded());
		fos.close();
		// 儲存私有錀匙
		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKey.getEncoded());
		fos = new FileOutputStream(path + "/private.key");
		fos.write(pkcs8EncodedKeySpec.getEncoded());
		fos.close();
	}

	// 由檔案中讀取錀匙配對方法
	public KeyPair LoadKeyPair(String path, String algorithm)
			throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
		// 讀取公開錀匙
		File filePublicKey = new File(path + "/public.key");
		FileInputStream fis = new FileInputStream(filePublicKey);
		byte[] encodedPublicKey = new byte[(int) filePublicKey.length()];
		fis.read(encodedPublicKey);
		fis.close();

		// 讀取私有錀匙方法
		File filePrivateKey = new File(path + "/private.key");
		fis = new FileInputStream(filePrivateKey);
		byte[] encodedPrivateKey = new byte[(int) filePrivateKey.length()];
		fis.read(encodedPrivateKey);
		fis.close();

		// generate keypair
		KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
		X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encodedPublicKey);
		PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
		PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
		PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
		return new KeyPair(publicKey, privateKey);

	}

}
