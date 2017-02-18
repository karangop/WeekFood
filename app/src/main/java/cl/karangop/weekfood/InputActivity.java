package cl.karangop.weekfood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        /*final TextView name= (TextView) findViewById(R.id.dayWeekTv);
        final SeekBar daySb= (SeekBar) findViewById(R.id.dayWeekSb);
        daySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress) {
                    case 0:
                        name.setText("Lunes");
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/
/*

        ;

        //instancias Radio Group
        final RadioGroup rgMon= (RadioGroup) findViewById(R.id.mixMonRg);
        final RadioGroup rgTue= (RadioGroup) findViewById(R.id.mixTueRg);
        final RadioGroup rgWed= (RadioGroup) findViewById(R.id.mixWedRg);
        final RadioGroup rgThu= (RadioGroup) findViewById(R.id.mixThuRg);
        final RadioGroup rgFri= (RadioGroup) findViewById(R.id.mixFriRg);
        final RadioGroup rgSat= (RadioGroup) findViewById(R.id.mixSatRg);
        final RadioGroup rgSun= (RadioGroup) findViewById(R.id.mixSunRg);


        daySb.setProgress(0);
        name.setText("Lunes"); //es lunes porque arriba estoy indicando 0= lunes;
        rgMon.setVisibility(View.VISIBLE);

        daySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //name.setText(String.valueOf(progress));

                *//*
                if (progress==1){
                    name.setText("Hola");
                }*//*

                //switch para que cambie el texto al día que selecciona en seekbar
                //Visible for radiogroup view and Gone for other days, only show of day
                switch (progress){
                    case 0:
                        name.setText("Lunes");
                        rgMon.setVisibility(View.VISIBLE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.GONE);
                        break;

                    case 1:
                        name.setText("Martes");
                        rgMon.setVisibility(View.GONE);
                        rgTue.setVisibility(View.VISIBLE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.GONE);
                        break;
                    case 2:
                        name.setText("Miércoles");
                        rgMon.setVisibility(View.GONE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.VISIBLE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.GONE);
                        break;
                    case 3:
                        name.setText("Jueves");
                        rgMon.setVisibility(View.GONE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.VISIBLE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.GONE);
                        break;
                    case 4:
                        name.setText("Viernes");
                        rgMon.setVisibility(View.GONE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.VISIBLE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.GONE);
                        break;
                    case 5:
                        name.setText("Sábado");
                        rgMon.setVisibility(View.GONE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.VISIBLE);
                        rgSun.setVisibility(View.GONE);
                        break;
                    case 6:
                        name.setText("Domingo");
                        rgMon.setVisibility(View.GONE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.VISIBLE);
                        break;
                    default:
                        name.setText("Lunes");
                        rgMon.setVisibility(View.VISIBLE);
                        rgTue.setVisibility(View.GONE);
                        rgWed.setVisibility(View.GONE);
                        rgThu.setVisibility(View.GONE);
                        rgFri.setVisibility(View.GONE);
                        rgSat.setVisibility(View.GONE);
                        rgSun.setVisibility(View.GONE);
                        break;
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            //metodo cuando suelto el seekbar
            public void onStopTrackingTouch(SeekBar seekBar) {

                *//**
                if(seekBar.getProgress()==6){
                    rg1.setVisibility(View.VISIBLE);
                }
                else
                    Snackbar.make(seekBar, "ERROR", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();*//*



            }
        });*/
    }
}
