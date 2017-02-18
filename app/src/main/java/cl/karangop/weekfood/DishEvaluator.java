package cl.karangop.weekfood;

/**
 * Created by karan_000 on 15-02-2017.
 */

public class DishEvaluator {


//    Lunes
    //Make this private
    private String monday= "Día de las verduras";

    private String dish1Day1= "Tortilla de porotos verdes con papas cocidas";
    private String urlDish1Day1= "https://cookpad.com/cl/recetas/1849458-tortilla-de-porotos-verdes";

    private String dish2Day1= "Tortilla de brocoli con papas mayo";
    private String urlDish2Day1= "https://cookpad.com/cl/recetas/838105-tortilla-de-brocoli";

    private String dish3Day1= "Zapallo italiano relleno con papas doradas";
    private String urlDish3Day1= "https://cookpad.com/cl/recetas/131137-zapallo-italiano-relleno-con-papas-doradas";

    private String dish4Day1="Tortilla de acelga con puré";
    private String urlDish4Day1="https://cookpad.com/cl/recetas/1147362-tortilla-de-acelgas";

//    Martes
    private String tuesday="Día del pollo";

    private String dish1Day2= "Pollo arvejado con puré";
    private String urlDish1Day2= "https://cookpad.com/cl/recetas/2011546-pollo-arvejado-a-mi-estilo-%F0%9F%98%80";

    private String dish2Day2="Ensalada césar";
    private String urlDish2Day2="https://cookpad.com/cl/recetas/1943778-ensalada-cesar";

    private String dish3Day2="Papas con pollo a la albahaca";
    private String urlDish3Day2="https://cookpad.com/cl/recetas/630785-pollo-al-horno-mechado-con-albahaca-y-ajo";

    private String dish4Day2="Nugget de pollo con arroz primavera";
    private String urlDish4Day2="https://cookpad.com/cl/recetas/1323736-nuggets-de-pollo";

//    Miércoles
    private String wednesday="Día del budín y guisos";

    private String dish1Day3="Guiso zapallo italiano con papas fritas";
    private String urlDish1Day3="https://cookpad.com/cl/recetas/910593-guiso-de-zapallo-italiano";

    private String dish2Day3= "Charquicán con huevo frito";
    private String urlDish2Day3= "https://cookpad.com/cl/recetas/1704337-charquican";

    private String dish3Day3= "Tomaticán con papas";
    private String urlDish3Day3= "https://cookpad.com/cl/recetas/1830002-tomatican";

    private String dish4Day3= "Carbonada";
    private String urlDish4Day3="https://cookpad.com/cl/recetas/918700-carbonada-rapida-y-sabrosa";

//    Jueves
    private String thursday= "Día de las legumbres";

    private String dish1Day4="Lentejas con huevo duro";
    private String urlDish1Day4="https://cookpad.com/cl/recetas/851701-lentejas-con-arroz";

    private String dish2Day4= "Porotos granados con tomate a la chilena";
    private String urlDish2Day4= "https://cookpad.com/cl/recetas/189811-porotos-granados";

    private String dish3Day4= "Garbanzos con longaniza";
    private String urlDish3Day4="https://cookpad.com/cl/recetas/1641014-garbanzos-con-arroz";

    private String dish4Day4="Porotos con riendas";
    private String urlDish4Day4="https://cookpad.com/cl/recetas/808086-porotos-viejos-con-riendas";

//    Viernes
    private String friday="Día de las masas";

    private String dish1Day5="Pastel de papas";
    private String urlDish1Day5="https://cookpad.com/cl/recetas/1895690-pastel-de-papa-super-rico-y-facil";

    private String dish2Day5="Tallarines con salsa de tomates";
    private String urlDish2Day5="https://cookpad.com/cl/recetas/734439-tallarines-con-salsa-bolonesa";

    private String dish3Day5="Lasaña";
    private String urlDish3Day5="https://www.maggi.cl/receta/750/lasa%C3%B1a-tradicional";

    private String dish4Day5="Tallarines con salsa blanca y pollo";
    private String urlDish4Day5="https://cookpad.com/cl/recetas/114668-tallarines-verdes-con-salsa-de-champinones-pollo-y-crema";

//    Sábado
    private String saturday="Día de la carne";

    private String dish1Day6="Bistec con arroz primavera";
    private String urlDish1Day6="https://cookpad.com/cl/recetas/1582012-bistec-de-res-en-coccion-15-minutos";

    private String dish2Day6="Carne al horno con puré";
    private String urlDish2Day6="https://cookpad.com/cl/recetas/1694299-carne-al-horno";

    private String dish3Day6="Carne mongoliana con arroz";
    private String urlDish3Day6="https://www.maggi.cl/receta/1075/carne-mongoliana";

    private String dish4Day6="Albóndigas con papas fritas";
    private String urlDish4Day6="https://cookpad.com/cl/recetas/1847394-albondigas";

//    Domingo
    private String sunday="Día del pescado";

    private String dish1Day7="Pescado al horno con papas mayo";
    private String urlDish1Day7="https://cookpad.com/cl/recetas/1849983-pescado-al-horno-con-verduras";

    private String dish2Day7="Croqueta de atún con arroz";
    private String urlDish2Day7="https://cookpad.com/cl/recetas/1867084-croquetas-de-atun-al-horno";

    private String dish3Day7="Pescado frito con tomate a la chilena";
    private String urlDish3Day7="https://cookpad.com/cl/recetas/295125-pescado-frito-crujiente";

    private String dish4Day7="Vegetariano con lomitos de atún";
    private String urlDish4Day7="https://cookpad.com/cl/recetas/1917515-ensalada-de-vegetales-legumbres-y-proteina";




    public String[] evaluate(int id) {

//Pasamos los parámetros con datos: dia de, plato, url
        switch (id){
            //Lunes
            case R.id.mix1Rg1:
                return new String[]{monday,dish1Day1,urlDish1Day1};
            case R.id.mix2Rg1:
                return new String[]{monday,dish2Day1,urlDish2Day1};
            case R.id.mix3Rg1:
                return new String[]{monday,dish3Day1,urlDish3Day1};
            case R.id.mix4Rg1:
                return new String[]{monday,dish4Day1,urlDish4Day1};

            //Martes
            case R.id.mix1Rg2:
                return new String[]{tuesday,dish1Day2,urlDish1Day2};
            case R.id.mix2Rg2:
                return new String[]{tuesday,dish2Day2,urlDish2Day2};
            case R.id.mix3Rg2:
                return new String[]{tuesday,dish3Day2,urlDish3Day2};
            case R.id.mix4Rg2:
                return new String[]{tuesday,dish4Day2,urlDish4Day2};

            //Miércoles
            case R.id.mix1Rg3:
                return new String[]{wednesday,dish1Day3,urlDish1Day3};
            case R.id.mix2Rg3:
                return new String[]{wednesday,dish2Day3,urlDish2Day3};
            case R.id.mix3Rg3:
                return new String[]{wednesday,dish3Day3,urlDish3Day3};
            case R.id.mix4Rg3:
                return new String[]{wednesday,dish4Day3,urlDish4Day3};

            //Jueves
            case R.id.mix1Rg4:
                return new String[]{thursday,dish1Day4,urlDish1Day4};
            case R.id.mix2Rg4:
                return new String[]{thursday,dish2Day4,urlDish2Day4};
            case R.id.mix3Rg4:
                return new String[]{thursday,dish3Day4,urlDish3Day4};
            case R.id.mix4Rg4:
                return new String[]{thursday,dish4Day4,urlDish4Day4};

            //Viernes
            case R.id.mix1Rg5:
                return new String[]{friday,dish1Day5,urlDish1Day5};
            case R.id.mix2Rg5:
                return new String[]{friday,dish2Day5,urlDish2Day5};
            case R.id.mix3Rg5:
                return new String[]{friday,dish3Day5,urlDish3Day5};
            case R.id.mix4Rg5:
                return new String[]{friday,dish4Day5,urlDish4Day5};

            //Sábado
            case R.id.mix1Rg6:
                return new String[]{saturday,dish1Day6,urlDish1Day6};
            case R.id.mix2Rg6:
                return new String[]{saturday,dish2Day6,urlDish2Day6};
            case R.id.mix3Rg6:
                return new String[]{saturday,dish3Day6,urlDish3Day6};
            case R.id.mix4Rg6:
                return new String[]{saturday,dish4Day6,urlDish4Day6};

            //Domingo
            case R.id.mix1Rg7:
                return new String[]{sunday,dish1Day7,urlDish1Day7};
            case R.id.mix2Rg7:
                return new String[]{sunday,dish2Day7,urlDish2Day7};
            case R.id.mix3Rg7:
                return new String[]{sunday,dish3Day7,urlDish3Day7};
            case R.id.mix4Rg7:
                return new String[]{sunday,dish4Day7,urlDish4Day7};

            default:
                return new String[]{"","", ""};
        }


        /*switch (id) {
            case R.id.firstBtn:
                return new String[]{"porotos", "www.awfawfa"};
            case R.id.secondBtn:
                return new String[]{"oli", "www.awfawfa"};
            case -1:
                return new String[]{"oliwi", "www.awfawfa"};
            default:
                return new String[]{"falló", "www.awfawfa"};
        }*/
    }

    //This is an example on how to get the values of the array
    /*private void example(){
        String[] array = evaluate(0);
        String dish = array[0];
        String url = array[1];
    }*/
}
