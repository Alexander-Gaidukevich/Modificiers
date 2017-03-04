package modifiers;

public class Test1 {
    private String name1 = "private";//доступ только внутри класса
    String name2 = "package";//члены класса видны внутри пакета,в рамках одного пакета
    protected String name3 = "protected";//члены класса доступны внутри пакета и в наследниках
    public String name4 = "public";//члены класс доступны всем
}
