package tcc.usjt.felix212;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class TelaLogin extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseAuth autenticacao;
    private  Usuarios usuarios;


    EditText email;
    EditText senha;
    Button btnLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        mAuth = FirebaseAuth.getInstance();

        email = (EditText)findViewById(R.id.editEmail);
        senha = (EditText)findViewById(R.id.editSenha);
        btnLogin = (Button)findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!email.getText().toString().equals("") && !senha.getText().toString().equals("")){
                    usuarios = new Usuarios();
                    usuarios.setEmail(email.getText().toString());
                    usuarios.setSenha(senha.getText().toString());
                    validarLogin();

                }else{
                    Toast.makeText(TelaLogin.this, "Preencha os campos de e-mail e senha", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void validarLogin(){

        autenticacao = ConfiguracaoFireBase.getFirebaseAutenticacao();
        autenticacao.signInWithEmailAndPassword(usuarios.getEmail(), usuarios.getSenha()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    abrirTelaPerfil();
                    Toast.makeText(TelaLogin.this, "Login Efetuado com sucesso", Toast.LENGTH_SHORT).show();
                }else{

                }

            }
        });
    }
    private void abrirTelaPerfil(){
        Intent intentAbrirTelaPerfil = new Intent(TelaLogin.this, TelaPerfil.class);
        startActivity(intentAbrirTelaPerfil);
    }

}
