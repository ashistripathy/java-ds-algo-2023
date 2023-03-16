package deutchBank;

class Employee {
    private String name;
    private int deptno;
    private int codeCommitCount;

    public Employee(String name, int deptno, int codeCommitCount) {
        this.name = name;
        this.deptno = deptno;
        this.codeCommitCount = codeCommitCount;
    }

    public String getName() {
        return name;
    }

    public int getDeptno() {
        return deptno;
    }

    public int getCodeCommitCount() {
        return codeCommitCount;
    }
}
