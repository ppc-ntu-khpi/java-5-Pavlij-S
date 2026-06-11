package domain;

/**
 * Представляє працівника з роллю редактора (Editor) у системі.
 * Цей клас розширює клас {@link Artist} та додає можливість обліку 
 * вподобань щодо формату редагування (електронний або паперовий).
 * * @author Pavlij-S
 * @version 1.0
 */
public class Editor extends Artist {

    /**
     * Повний конструктор для створення об'єкта Editor із зазначенням усіх особистих даних, 
     * навичок та вподобань щодо типу редагування.
     * * @param electronicEditing прапорець вподобань (true — електронне, false — паперове)
     * @param skiils            масив рядків, що містить перелік навичок редактора
     * @param name              ім'я працівника
     * @param jobTitle          назва посади працівника
     * @param level             рівень кваліфікації працівника
     * @param dept              назва департаменту або відділу
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення об'єкта Editor із зазначенням навичок 
     * та вподобань щодо формату редагування.
     * * @param electronicEditing прапорець вподобань (true — електронне, false — паперове)
     * @param skiils            масив рядків, що містить перелік навичок редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення об'єкта Editor лише з налаштуванням формату редагування.
     * Для інших полів викликається базовий конструктор класу Artist за замовчуванням.
     * * @param electronicEditing прапорець вподобань (true — електронне, false — паперове)
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор за замовчуванням. Створює об'єкт Editor, ініціалізує 
     * базові поля художника та встановлює електронний формат редагування як пріоритетний за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстове представлення інформації про редактора.
     * Включає інформацію з класу Artist та додає текстовий опис формату редагування 
     * ("electronic" або "paper").
     * * @return рядок із детальною інформацією про об'єкт Editor
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * Прапорець, що визначає тип редагування: true для електронного, false для паперового.
     */
    private boolean electronicEditing;

    /**
     * Повертає поточні вподобання редактора щодо формату роботи.
     * * @return true, якщо редагування електронне; false, якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює нові вподобання щодо формату редагування.
     * * @param electronic нове значення прапорця (true для електронного, false для паперового)
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}