package com.github.ewanme.romresbot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AesEncryptionTest {

	@Test
	public void testEncryptionDecryption() {
		String secretKey = "secretkey123";
		
		String originalMsg = "This is a secret message";
		String encryptedMsg = AESEncryption.encrypt(originalMsg, secretKey);
		
		assertNotEquals(originalMsg, encryptedMsg);
		
		String decryptedMsg = AESEncryption.decrypt(encryptedMsg, secretKey);
		
		assertEquals(originalMsg, decryptedMsg);
		
		
	}
}
