package examples;

import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import java.security.*;
public class Err2 {
// https://habr.com/ru/companies/alfa/articles/441212/
    public static void err(KeyStore keyStore,  String alias, char[] pwd)
            throws Exception {
        JCPProtectionParameter parameter = new JCPProtectionParameter(pwd);
        JCPPrivateKeyEntry entry = (JCPPrivateKeyEntry) keyStore.getEntry(alias, parameter);
    }
}
