/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.quadribol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * Este app contabiliza pontos e faltas em um jogo de quadribol.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Variável para a quantidade de pontos e faltas de cada time.
     */

    int pontosGrifinoria = 0;
    int faltasGrifinoria = 0;
    int pontosSonserina = 0;
    int faltasSonserina = 0;

    /**
     * Este método atua quando o botão Pomo de Ouro é clicado.
     */
    public void incrementPomoGrifinoria(View view) {
        pontosGrifinoria += 150;
        displayPontosGrifinoria(pontosGrifinoria);
    }

    /**
     * Este método é chamado quando o botão pontos é clicado.
     */
    public void incrementGolGrifinoria(View view) {
        pontosGrifinoria += 10;
        displayPontosGrifinoria(pontosGrifinoria);
    }

    /**
     * Este método mostra o número de pontos do primeiro time.
     */
    private void displayPontosGrifinoria(int number) {
        TextView GrifinoriaTextView = findViewById(R.id.pontosGrifinoria);
        GrifinoriaTextView.setText("" + number);
    }

    /**
     * Este método é chamado quando o botão faltas é clicado.
     */
    public void incrementFaltasGrifinoria(View view) {
        faltasGrifinoria ++;
        displayFaltasGrifinoria(faltasGrifinoria);
    }
    /**
     * Este método mostra o número de faltas na tela.
     */

    private void displayFaltasGrifinoria(int number) {
        TextView grifinoriaFaltasTextView = findViewById(R.id.faltasGrifinoria);
        grifinoriaFaltasTextView.setText("" + number);

    }

    /**
     * Este método é acionado quando o botão Pomo de Ouro é clicado.
     */
    public void incrementPomoSonserina(View view) {
        pontosSonserina += 150;
        displayPontosSonserina(pontosSonserina);
    }

    /**
     * Este método é acionado quando o botão gol é acionado.
     */
    public void incrementGolSonserina(View view) {
        pontosSonserina += 10;
        displayPontosSonserina(pontosSonserina);
    }

    /**
     * Este método é acionado quando o botão faltas é acionado.
     */
    public void incrementFaltasSonserina(View view) {
        faltasSonserina ++;
        displayFaltasSonserina(faltasSonserina);
    }

    /**
     * Este método mostra o número de pontos do segundo time.
     */
    private void displayPontosSonserina(int number) {
        TextView pontosSonserinaTextView = findViewById(R.id.pontosSonserina);
        pontosSonserinaTextView.setText("" + number);
    }

    /**
     * Este método mostra o número de faltas do segundo time.
     */

    private void displayFaltasSonserina(int number) {
       TextView faltasSonserinaTextView = findViewById(R.id.faltasSonserina);
       faltasSonserinaTextView.setText("" + number);

    }
    /**
     * Este método é chamado quando o botão reset é clicado. Ele zera todos as variáveis.
     */
    public void apagar(View view) {
        pontosGrifinoria = 0;
        faltasGrifinoria = 0;
        pontosSonserina = 0;
        faltasSonserina = 0;
        displayPontosGrifinoria(pontosGrifinoria);
        displayFaltasGrifinoria(faltasGrifinoria);
        displayPontosSonserina(pontosSonserina);
        displayFaltasSonserina(faltasSonserina);
    }

}