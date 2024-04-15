package ru.medical.clinic;

// Создаём класс "Дантист"
class Dentist extends Doctor {
    @Override // Переопределяем метод "Лечить" из суперкласса для врача "Дантист"
    public void toHeal() {
        System.out.println("Дантист лечит пациента.");
    }
}
