package ru.medical.clinic;

// Создаём класс "Терапевт"
class Therapist extends Doctor {

    // Создаем метод "Назначить доктора"
    public void assignDoctor() {
        Patient patient = new Patient(); // Создаем новый объект класса "Пациент"
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();

        if (patient.assignedPlan == 1) { // Если назначен план, равный 1, то назначить врачом Хирурга
            patient.setDoctor(surgeon);
        } else if (patient.assignedPlan == 2) { // Если назначен план, равный 2, то назначить врачом Дантиста
            patient.setDoctor(dentist);
        } else { // Во всех остальных случаях, если назначен план, не равный 1 или 2, то назначить врачом Терапевта
            patient.setDoctor(therapist);
        }
//        System.out.println(patient.doctor);
        patient.doctor.toHeal(); // После назначения врача в соответствии с планом вызываем у назначенного врача метод "Лечить"
    }

    @Override // Переопределяем метод "Лечить" из суперкласса для врача "Терапевт"
    public void toHeal() {
        System.out.println("Терапевт лечит пациента.");
    }
}
