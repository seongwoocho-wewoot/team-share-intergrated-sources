package team.share.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
@Transactional
public class RightTxService {


    public void doTx() {
        System.out.println("isActiveTx() = " + isActiveTx());
    }

    private static boolean isActiveTx() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }

}

