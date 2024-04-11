package com.ugb.tiendaonlinejuegos;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Base64;
import java.util.UUID;
@RequiresApi(api = Build.VERSION_CODES.O)
public class utilidades {
    static String urlConsulta="http://192.168.1.19:5984/tiendaonline/_design/TiendaOnline/_view/TiendaOnline";
    static String urlMto="http://127.0.0.1:5984/_utils/#/_all_dbs";
    static String user="admin";
    static String passwd="admin";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}