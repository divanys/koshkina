package pz_16_2;

class Performer extends Person implements Employee {
    private String performanceName;
    private Performance performance;

    public Performer(String lastName, String firstName, String middleName, int age, String performanceName) {
        super(lastName, firstName, middleName, age);
        setPerformanceName(performanceName);
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    // Метод для регистрации артиста на представление
    public void registerForPerformance(Performance performance) {
        if (performance != null) {
            setPerformance(performance);
            System.out.printf("%s %s %s зарегистрирован на %s %s %s в %s!\n",
                    getLastName(), getFirstName(), getMiddleName(),
                    performance.getShowType(), getPerformanceName(), performance.getDate(), performance.getTime());
        } else {
            System.out.println("Ошибка: Нельзя зарегистрировать артиста на пустое представление.");
        }
    }

    // Метод для снятия артиста с представления
    public void unregisterFromPerformance() {
        if (getPerformance() != null) {
            System.out.printf("%s %s %s удален с %s %s %s в %s.\n",
                    getLastName(), getFirstName(), getMiddleName(),
                    getPerformance().getShowType(), getPerformanceName(), getPerformance().getDate(), getPerformance().getTime());
            setPerformance(null);
        } else {
            System.out.println("Этот артист не был зарегистрирован на представлении.");
        }
    }

    public void printPerformer() {
        if (getPerformance() != null) {
            System.out.printf("%s %s %s выступает на %s %s %s в %s!\n",
                    getLastName(), getFirstName(), getMiddleName(),
                    getPerformance().getShowType(), getPerformanceName(), getPerformance().getDate(), getPerformance().getTime());
        } else {
            System.out.println("Этот артист не зарегистрирован на представлении.");
        }
    }
}
