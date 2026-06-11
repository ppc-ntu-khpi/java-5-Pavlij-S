package domain;

/**
 * Представляє працівника з роллю менеджера (Manager) у системі.
 * Цей клас розширює клас {@link Employee} та додає можливість керування 
 * колекцією (масивом) підлеглих співробітников.
 * * @author Pavlij-S
 * @version 1.0
 */
public class Manager extends Employee {

    /**
     * Повний конструктор для створення об'єкта Manager із зазначенням усіх особистих даних 
     * та масиву підлеглих працівників.
     * * @param employees масив об'єктів {@link Employee}, які перебувають у підпорядкуванні менеджера
     * @param name      ім'я менеджера
     * @param jobTitle  назва посади менеджера
     * @param level     рівень кваліфікації менеджера
     * @param dept      назва департаменту або відділу
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає текстове представлення інформації про менеджера.
     * Включає базову інформацію про працівника та список імен його підлеглих.
     * * @return рядок із детальною інформацією про об'єкт Manager
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор для створення об'єкта Manager із зазначенням лише масиву підлеглих.
     * Для інших полів викликається базовий конструктор класу Employee за замовчуванням.
     * * @param employees масив об'єктів {@link Employee}, які перебувають у підпорядкуванні
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор за замовчуванням. Створює об'єкт Manager, ініціалізує 
     * базові поля працівника та виділяє пам'ять під масив підлеглих розміром у 10 елементів.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Масив працівників, які перебувають під керівництвом цього менеджера.
     */
    private Employee[] employees;

    /**
     * Повертає імена всіх підлеглих працівників у вигляді одного текстового рядка, 
     * де елементи розділені комою.
     * * @return рядок із переліком імен підлеглих, розділених комами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий масив підлеглих працівників для менеджера.
     * * @param employees новий масив об'єктів {@link Employee}
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає безпосередньо сам масив об'єктів підлеглих працівників.
     * * @return оригінальний масив підлеглих типу Employee[]
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}