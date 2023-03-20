package team.share.transaction.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class WrongTxController {

    @GetMapping("/test/tx-wrong")
    public void test_tx() {
        System.out.println("isActiveTx = " + isActiveTx());
    }

    private static boolean isActiveTx() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }
}
