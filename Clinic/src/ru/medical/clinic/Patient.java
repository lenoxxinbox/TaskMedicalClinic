package ru.medical.clinic;

// Создаем класс "Пациент"
class Patient {
    int assignedPlan; // Создаем поле "назначенный план" с типом int
    Doctor doctor; // Создаем поле "Доктор" с типом Doctor
    // Создаем метод "Назначить план"
    public void setAssignedPlan(int plan) {
        this.assignedPlan = plan; // Присваиваем значение параметра plan текущего объекта класса "Пациент"
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor; // Присваиваем значение параметра doctor текущего объекта класса "Пациент"
    }
}
