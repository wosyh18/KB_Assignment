package ch6.p5;

public class MyResource implements Resource, AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource(" + name + ") 열기]");
    }
    @Override
    public String read1() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "100";
    }

    @Override
    public String read2() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "abc";
    }
    @Override
    public void close() throws Exception{
        System.out.println("[MyResource (" + name + ") 닫기");
    }

}
