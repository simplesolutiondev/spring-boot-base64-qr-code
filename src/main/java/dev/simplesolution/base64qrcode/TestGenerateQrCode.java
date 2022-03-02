package dev.simplesolution.base64qrcode;

import dev.simplesolution.base64qrcode.service.QrCodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestGenerateQrCode implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(TestGenerateQrCode.class);

    @Autowired
    private QrCodeService qrCodeService;

    @Override
    public void run(String... args) throws Exception {
        String qrCodeContent = "Simple Solution";
        int width = 400;
        int height = 400;
        String qrCodeBase64 = qrCodeService.generateQRCodeBase64(qrCodeContent, width, height);
        logger.info(qrCodeBase64);
    }
}
