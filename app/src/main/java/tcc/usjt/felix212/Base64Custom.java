package tcc.usjt.felix212;

import android.util.Base64;

/**
 * Created by alan0 on 09/08/2017.
 */

public class Base64Custom {
    public static String codificarBase64(){
        
        return Base64.encodeToString(texto.getBytes(),Base64.DEFAULT).replaceAll( "(\\n|\\r)","");

    }
}
