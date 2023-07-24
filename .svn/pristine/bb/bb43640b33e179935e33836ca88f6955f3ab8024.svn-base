package org.cybercrowd.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 启动程序
 * 
 * @author 
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CyberCrowdAdminApplication {

    private static Logger logger = LoggerFactory.getLogger(CyberCrowdAdminApplication.class);

    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CyberCrowdAdminApplication.class, args);
        logger.info("CyberCrowdAdminApplication Run Success ........ ");
        test();
    }

    public static void test(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date gameStartTime = new Date();
        logger.info("当前时间:{}",simpleDateFormat.format(gameStartTime));
        LocalDateTime localDateTime = LocalDateTime.ofInstant(gameStartTime.toInstant(), ZoneId.systemDefault());
        LocalDateTime newLocalDateTime = localDateTime.plusHours(24);
        Date newGameStartTime = Date.from(newLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());
        logger.info("更新后时间:{}",simpleDateFormat.format(newGameStartTime));
    }

    @Value("${web3j.ethereum.rpc-url}")
    private String ethereumRpcUrl;

    @Bean
    public Web3j initWeb3jClient(){
        return Web3j.build(new HttpService(ethereumRpcUrl));
    }
}
