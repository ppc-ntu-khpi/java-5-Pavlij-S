package domain;

/**
 * Представляє працівника з роллю художника (Artist) у системі.
 * Цей клас розширює базовий клас {@link Employee} та додає облік професійних навичок.
 * * @author Pavlij-S
 * @version 1.0
 */
public class Artist extends Employee {

    /**
     * Повний конструктор для створення об'єкта Artist із зазначенням усіх особистих даних та навичок.
     * * @param skiils   масив рядків, що містить перелік навичок художника
     * @param name     ім'я працівника
     * @param jobTitle назва посади працівника
     * @param level    рівень кваліфікації працівника
     * @param dept     назва департаменту або відділу
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор для створення об'єкта Artist лише з масивом навичок.
     * Для інших полів викликається базовий конструктор за замовчуванням.
     * * @param skiils масив рядків, що містить перелік навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Конструктор за замовчуванням. Створює об'єкт Artist та
     * ініціалізує масив навичок розміром у 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає текстове представлення інформації про художника.
     * Включає базову інформацію про працівника та список його навичок.
     * * @return рядок із детальною інформацією про об'єкт Artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Масив для збереження професійних навичок художника.
     */
    private String[] skiils;

    /**
     * Повертає навички художника у вигляді одного текстового рядка, де елементи розділені комою.
     * * @return рядок із переліком навичок, розділених комами
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий масив навичок для художника.
     * * @param skills новий масив рядків із навичками
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає безпосередньо сам масив рядків, що містить навички художника.
     * * @return оригінальний масив навичок (тип String[])
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}