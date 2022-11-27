////    Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
////    Если значение null, то параметр не должен попадать в запрос.
////    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
////
//
//
//
//public class Task1 {
//
//    public static void main() {
//        String myString = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}";
//        System.out.println(jsonToSql(myString));
//    }
//
//    public static String jsonToSql(String myJSON) {
//
//    }
//
//
//}