package ru.medical.clinic;

// Создаем класс "Пациент"
class Patient {
    int assignedPlan; // Объявляем переменную "назначенный план" с типом int

    // Создаем метод "Назначить план"
    void setAssignedPlan(int plan) {
        this.assignedPlan = plan; // Присваиваем значение параметра plan текущего объекта класса "Пациент"
    }
}
