package domain;

/**
 * Представляє базовий клас працівника (Employee) у системі.
 * Містить основну інформацію про співробітника, таку як ім'я, посада, 
 * унікальний ідентифікатор, рівень кваліфікації та департамент, 
 * а також логіку для їхньої перевірки та встановлення.
 * * @author Pavlij-S
 * @version 1.0
 */
public class Employee {

    /**
     * Повертає текстове представлення інформації про працівника.
     * Виводить у стовпчик ідентифікатор (ID), ім'я, посаду, рівень та департамент.
     * * @return рядок із детальними даними працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Ім'я працівника.
     */
    private String name;
    
    /**
     * Назва посади працівника.
     */
    private String jobTitle;
    
    /**
     * Унікальний числовий ідентифікатор працівника.
     */
    private int ID;
    
    /**
     * Рівень кваліфікації працівника (дозволені значення: 1, 2 або 3).
     */
    private int level;
    
    /**
     * Департамент або відділ, до якого належить працівник.
     */
    private String dept;

    // private static int employeesCount = 0;

    /**
     * Повний конструктор для створення об'єкта Employee із базовим набором даних.
     * Спочатку викликає конструктор за замовчуванням для генерації унікального ID, 
     * після чого перевіряє та встановлює інші параметри.
     * * @param name     ім'я працівника (має відповідати правилам валідації імені)
     * @param jobTitle назва посади працівника
     * @param level    рівень кваліфікації (приймає значення 1, 2 або 3; інакше встановлюється 1)
     * @param dept     назва департаменту або відділу
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням. Автоматично генерує випадкове число 
     * від 0 до 999 та присвоює його як унікальний ідентифікатор (ID) працівника.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює назву посади працівника.
     * * @param job нова назва посади
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає назву посади працівника.
     * * @return поточна посада працівника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     * * @return поточне ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації працівника.
     * Дозволеними є рівні 1, 2 та 3. Якщо передане значення не входить 
     * у цей діапазон, рівню автоматично присвоюється значення 1.
     * * @param level новий рівень кваліфікації працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень кваліфікації працівника.
     * * @return поточний рівень кваліфікації (1, 2 або 3)
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву департаменту або відділу працівника.
     * * @return назва департаменту
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює назву департаменту або відділу працівника.
     * * @param dept нова назва департаменту
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Перевіряє та встановлює ім'я працівника за допомогою регулярного виразу.
     * Ім'я повинно містити правильні символи (літери, пробіли, дефіси, апострофи). 
     * Якщо ім'я успішно проходить перевірку, воно зберігається; 
     * якщо формат некоректний, працівнику присвоюється ім'я за замовчуванням — "John Doe".
     * * @param name ім'я для перевірки та встановлення
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}