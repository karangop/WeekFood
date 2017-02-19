package cl.karangop.weekfood;


import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MixFragment extends Fragment {

    private int progress;

    public MixFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mix, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //getActivity().findViewById()   --> this form access to id from activity


        final TextView name= (TextView) getActivity().findViewById(R.id.dayWeekTv);
        final SeekBar daySb= (SeekBar) getActivity().findViewById(R.id.dayWeekSb);

        //rescato el nombre
        final EditText namePerson= (EditText) getActivity().findViewById(R.id.nameEt);

        //instancias Radio Group
        final RadioGroup rgMon= (RadioGroup) getActivity().findViewById(R.id.mixMonRg);
        final RadioGroup rgTue= (RadioGroup) getActivity().findViewById(R.id.mixTueRg);
        final RadioGroup rgWed= (RadioGroup) getActivity().findViewById(R.id.mixWedRg);
        final RadioGroup rgThu= (RadioGroup) getActivity().findViewById(R.id.mixThuRg);
        final RadioGroup rgFri= (RadioGroup) getActivity().findViewById(R.id.mixFriRg);
        final RadioGroup rgSat= (RadioGroup) getActivity().findViewById(R.id.mixSatRg);
        final RadioGroup rgSun= (RadioGroup) getActivity().findViewById(R.id.mixSunRg);


        Button btnShowDish= (Button) getActivity().findViewById(R.id.btnShowDish);


        daySb.setProgress(0);
        name.setText("Lunes"); //es lunes porque arriba estoy indicando 0= lunes;
        rgMon.setVisibility(View.VISIBLE);

        daySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                MixFragment.this.progress =progress;
                //name.setText(String.valueOf(progress));

                /*
                if (progress==1){
                    name.setText("Hola");
                }*/

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

                /**
                 if(seekBar.getProgress()==6){
                 rg1.setVisibility(View.VISIBLE);
                 }
                 else
                 Snackbar.make(seekBar, "ERROR", Snackbar.LENGTH_LONG)
                 .setAction("Action", null).show();*/



            }
        });

        btnShowDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = 0;
                switch (progress){
                    case 0:
                        id = rgMon.getCheckedRadioButtonId();
                        break;
                    case 1:
                        id= rgTue.getCheckedRadioButtonId();
                        break;
                    case 2:
                        id= rgWed.getCheckedRadioButtonId();
                        break;
                    case 3:
                        id= rgThu.getCheckedRadioButtonId();
                        break;
                    case 4:
                        id= rgFri.getCheckedRadioButtonId();
                        break;
                    case 5:
                        id= rgSat.getCheckedRadioButtonId();
                        break;
                    case 6:
                        id= rgSun.getCheckedRadioButtonId();
                        break;
                    default:
                        id= 0;
                        break;
                }


                //try catch para capturar error cuando no existen recetas
                try {
                    String[] array = new DishEvaluator().evaluate(id);
                    String title= array[0];
                    String dish = array[1];
                    final String url = array[2];

//                    VALIDACIONES
                    //si el plato esta vacio, no tiene información para mostrar.
                    if (namePerson.getText().toString().trim().length() == 0){
                        Toast.makeText(getContext(), "Ingrese su nombre", Toast.LENGTH_SHORT).show();
                    }else if (id == -1) {
                        Toast.makeText(getContext(), "Selecciona un ingrediente", Toast.LENGTH_SHORT).show();
                    }else if (dish.isEmpty()){
                        Toast.makeText(getContext(), "No hay plato con ese ingrediente", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        AlertDialog.Builder alert= new AlertDialog.Builder(getContext());
                        alert.setTitle(title);
                        alert.setMessage(namePerson.getText().toString() + ", te recomiendo este plato: \n\n" + dish);
                        alert.setPositiveButton("Ver receta", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent receta= new Intent(Intent.ACTION_VIEW);
                                if (url.isEmpty()){
                                    Toast.makeText(getContext(), "No hay receta para ese plato", Toast.LENGTH_SHORT).show();
                                }else{
                                    receta.setData(Uri.parse(url));
                                    startActivity(receta);
                                }


                            }
                        });

                        alert.setNegativeButton("Volver", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }


                }catch (Exception e){
                    Toast.makeText(getContext(), "NO EXISTE RECETA", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }



}
