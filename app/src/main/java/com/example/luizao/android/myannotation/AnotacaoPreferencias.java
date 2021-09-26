package com.example.luizao.android.myannotation;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {

    private Context context;
    private SharedPreferences sharedPreferences;
    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private SharedPreferences.Editor editor;
    private final String CHAVE_NOME="nome";

    public AnotacaoPreferencias(Context c ) {
        this.context=c;
        sharedPreferences = context.getSharedPreferences(NOME_ARQUIVO,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    public void salvarAnotacao(String anotacao){
        editor.putString(CHAVE_NOME,anotacao);
        editor.commit();
     }


     public String recuperarAnotacao(){

         return sharedPreferences.getString(CHAVE_NOME,"");
     }
}
