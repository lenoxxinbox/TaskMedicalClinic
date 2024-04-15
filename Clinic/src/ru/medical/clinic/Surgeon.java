package ru.medical.clinic;

// Создаём класс "Хирург"
class Surgeon extends Doctor {
    @Override // Переопределяем метод "Лечить" из суперкласса для врача "Хирург"
    public void toHeal() {
        System.out.println("Хирург лечит пациента.");
    }
}
