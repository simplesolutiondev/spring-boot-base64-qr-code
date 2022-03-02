package dev.simplesolution.base64qrcode.service;

public interface QrCodeService {
    String generateQRCodeBase64(String qrCodeContent, int width, int height);
}