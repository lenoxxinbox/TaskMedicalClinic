package ru.medical.clinic;

public class Main {
    public static void main(String[] args) { // Метод точки входа в программу
        Patient patient = new Patient(); // Создаем новый объект класса "Пациент"
        Therapist therapist = new Therapist(); // Создаем новый объект класса "Терапевт"

        patient.setAssignedPlan(1); // Вызываем у объекта "Пациент" метод "Назначить план" с параметром "План лечения" = 1
        System.out.println(patient.assignedPlan);
        therapist.assignDoctor(); // Вызываем у объекта "Терапевт" метод "Назначить доктора"
        System.out.println(patient.doctor);

        patient.setAssignedPlan(2); // Вызываем у объекта "Пациент" метод "Назначить план" с параметром "План лечения" = 2
        System.out.println(patient.assignedPlan);
        therapist.assignDoctor(); // Вызываем у объекта "Терапевт" метод "Назначить доктора"
        System.out.println(patient.doctor);

        patient.setAssignedPlan(5); // Вызываем у объекта "Пациент" метод "Назначить план" с параметром "План лечения" = 5
        System.out.println(patient.assignedPlan);
        therapist.assignDoctor(); // Вызываем у объекта "Терапевт" метод "Назначить доктора"
        System.out.println(patient.doctor);
    }
}
