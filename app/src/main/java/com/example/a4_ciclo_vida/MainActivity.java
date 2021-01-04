package com.example.a4_ciclo_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//FUENTE: https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es

    //onCreate
    //que se activa cuando el sistema crea la actividad por primera vez. Cuando se crea la actividad,
    //esta entra en el estado Created. En el método onCreate(),
    // ejecutas la lógica de arranque básica de la aplicación que debe ocurrir una sola vez en toda la vida de la actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //onStart
    // La llamada onStart() hace que el usuario pueda ver la actividad mientras la app se prepara
    //para que esta entre en primer plano y se convierta en interactiva.
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    //onResume
    //Cuando la actividad entra en el estado Resumed, pasa al primer plano y, a continuación, el
    //sistema invoca la devolución de llamada onResume(). Este es el estado en el que la app interactúa con el usuario.
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    //onPause
    //El sistema llama a este método a modo de primera indicación de que el usuario está abandonando tu actividad
    // (aunque no siempre significa que está finalizando la actividad); esto indica que la actividad ya no está en primer plano
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    //onStop
    //Cuando el usuario ya no puede ver tu actividad, significa que ha entrado en el estado Stopped, y el sistema invoca la devolución de llamada onStop(). Esto puede ocurrir, por ejemplo, cuando una actividad recién lanzada cubre toda la pantalla.
    // El sistema también puede llamar a onStop() cuando haya terminado la actividad y esté a punto de finalizar.
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    //onDestroy
    //Se llama a onDestroy() antes de que finalice la actividad. El sistema invoca esta devolución de llamada por los siguientes motivos:
    //[1]La actividad está terminando (debido a que el usuario la descarta por completo o a que se llama a finish()).
    //[2]El sistema está finalizando temporalmente la actividad debido a un cambio de configuración (como la rotación del dispositivo o el modo multiventana).
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }

}