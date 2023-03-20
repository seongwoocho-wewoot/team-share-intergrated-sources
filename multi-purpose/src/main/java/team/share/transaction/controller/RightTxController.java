package team.share.transaction.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.share.transaction.service.RightTxService;

@RestController
@RequiredArgsConstructor
public class RightTxController {

    private final RightTxService service;

    @GetMapping("/test/tx-right")
    public void test_tx() {
        System.out.println("before isActiveTx = " + isActiveTx());
        service.doTx();
        System.out.println("after isActiveTx = " + isActiveTx());
    }

    private static boolean isActiveTx() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }
}
