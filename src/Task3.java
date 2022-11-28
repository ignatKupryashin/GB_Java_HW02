//3**Дана json строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//    Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//    Пример вывода:
//    Студент Иванов получил 5 по предмету Математика.
//    Студент Петрова получил 4 по предмету Информатика.
//    Студент Краснов получил 5 по предмету Физика.
//
//            https://comaqa.gitbook.io/java-automation/rabota-s-failami/rabota-s-json-failami
//


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task3 {
    public static void main(String[] args) throws ParseException {
        String[] myString = {"{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}",
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}",
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}"};

        JSONParser myParser = new JSONParser();
        for (String item:myString
             ) {
            Object obj = myParser.parse(item);
            JSONObject myJSON = (JSONObject) obj;
            System.out.println(String.format("Студент %s получил %s по предмету %s", myJSON.get("фамилия"), myJSON.get("оценка"), myJSON.get("предмет")));
        }




    }
}
