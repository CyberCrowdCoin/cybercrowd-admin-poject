package org.cybercrowd.admin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ContractPlayerService {

    private Logger logger = LoggerFactory.getLogger(ContractPlayerService.class);

    @Autowired
    Web3j web3j;

    public ArrayList<Player> pullPlayer(String contract) {
        try {
            Function function = new Function("getLastRoundPlayers", Arrays.<Type>asList(),
                    Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Player>>() {
                    }));
            Transaction transaction = Transaction.createEthCallTransaction(
                    "0x52129424797b23183934A3684B2f05a465005c4A",contract, FunctionEncoder.encode(function));
            EthCall send = web3j.ethCall(transaction, DefaultBlockParameterName.LATEST).send();
            List<Type> results = FunctionReturnDecoder.decode(send.getValue(), function.getOutputParameters());
            ArrayList<Player> players = (ArrayList<Player>) results.get(0).getValue();
            return players;
        }catch (Exception e){
            logger.error("拉取合约数据异常:{}",e.getMessage(),e);
        }
        return null;
    }

    public List<Player> pullPlayerWinners(String contract) {
        try {
            Function function = new Function("getLastRoundWinners", Arrays.<Type>asList(),
                    Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Player>>() {
                    }));
            Transaction transaction = Transaction.createEthCallTransaction(
                    "0x52129424797b23183934A3684B2f05a465005c4A",contract, FunctionEncoder.encode(function));
            EthCall send = web3j.ethCall(transaction, DefaultBlockParameterName.LATEST).send();
            List<Type> results = FunctionReturnDecoder.decode(send.getValue(), function.getOutputParameters());
            List<Player> players = (List<Player>) results.get(0).getValue();
            return players;
        }catch (Exception e){
            logger.error("拉取合约数据异常:{}",e.getMessage(),e);
        }
        return null;
    }


}
