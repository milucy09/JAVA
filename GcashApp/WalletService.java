package GcashApp;

import java.util.*;
public class WalletService {
    private Map<String, User> users = new HashMap<>();
    private Map<String, List<Transaction>> transactionLogs = new HashMap<>();
    private User currentUser = null;


