package dz_4.Services;

import dz_4.Interfaces.ICashRepo;
import dz_4.Models.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class CashRepository implements ICashRepo {
    private static CashRepository cashRepository;

    private List<BankAccount> clients;

    public List<BankAccount> getClients() {
        return clients;
    }

    private CashRepository() {
        //имитация работы банка
        clients = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            clients.add(new BankAccount());
        }