package ru.medical.clinic;

public class Main {
    public static void main(String[] args) { // Метод точки входа в программу
        Patient patient = new Patient(); // Создаем новый объект класса "Пациент"
        Therapist therapist = new Therapist(); // Создаем новый объект класса "Терапевт"

        patient.setAssignedPlan(1); // Вызываем у объекта "Пациент" метод "Назначить план" с параметром "План лечения" = 1
        therapist.assignDoctor(); // Вызываем у объекта "Терапевт" метод "Назначить доктора"

        patient.setAssignedPlan(2); // Вызываем у объекта "Пациент" метод "Назначить план" с параметром "План лечения" = 2
        therapist.assignDoctor(); // Вызываем у объекта "Терапевт" метод "Назначить доктора"

        patient.setAssignedPlan(5); // Вызываем у объекта "Пациент" метод "Назначить план" с параметром "План лечения" = 5
        therapist.assignDoctor(); // Вызываем у объекта "Терапевт" метод "Назначить доктора"
    }
}
