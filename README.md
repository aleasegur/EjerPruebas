EJERCICIOS PRACTICAS O PRUEBAS:

Actividad 1: Calculadora de propinas
Escribe un programa que pida al usuario el total de una cuenta y un porcentaje de propina, y calcule el monto de la propina y el total a pagar.
Funciones sugeridas:
double calculateTip(total, percentage)
double calculateTotal(total, tip)

Actividad 2: Gestor de tareas diarias
Crea un programa que pida al usuario ingresar la cantidad de horas dedicadas a tres actividades diferentes (trabajo, ejercicio y ocio) y calcule el porcentaje de tiempo dedicado a cada una respecto al total.
Funciones sugeridas:
boolean validHours(hours) para validar que las horas sean positivas.
double calculatePercentage(part, total) para obtener el porcentaje.

Actividad 3: Conversor de temperatura
Haz un programa que convierta una temperatura entre Celsius y Fahrenheit según la elección del usuario.
Funciones sugeridas:
double celsiusToFahrenheit(celsius)
double fahrenheitToCelsius(fahrenheit)
void showTemperatureMenu() para mostrar las opciones al usuario.

Actividad 4: Planificador de ahorro
Crea un programa que reciba un objetivo de ahorro, un saldo inicial y un monto mensual que el usuario planea ahorrar. Calcula cuántos meses tomará alcanzar el objetivo.
Funciones sugeridas:
boolean isPositive(amount) para validar las entradas.
int calculateMonths(goal, initial, monthly) para determinar el número de meses.

Actividad 5: Sistema de votación
Escribe un programa que simule un sistema de votación entre tres opciones (por ejemplo, tres candidatos). Solicita al usuario el número de votos para cada opción y determina cuál es la más votada o si hay empate.
Funciones sugeridas:
boolean validateVotes(votes) para verificar que los votos sean válidos.
int findWinner(votes1, votes2, votes3) para determinar el ganador.

Actividad 6: Cálculo del IMC
Realiza un programa que pida al usuario su peso en kilogramos y su altura en metros, calcule su índice de masa corporal (IMC) e indique si está en un rango saludable.
Funciones sugeridas:
boolean validateInput(value) para comprobar que las entradas sean válidas.
double calculateIMC(weight, height) para calcular el IMC.
void displayIMCResult(imc) para mostrar el rango correspondiente.

Actividad 7: Cálculo de horas trabajadas
Crea un programa que solicite la hora de entrada y salida de un trabajador en formato de 24 horas y calcule las horas trabajadas, considerando validaciones para entradas erróneas.
Funciones sugeridas:
boolean validateTime(hour) para validar las horas introducidas.
int calculateHoursWorked(start, end) para calcular las horas trabajadas.

Actividad 8: Conversor de monedas
Desarrolla un programa que convierta una cantidad en euros a dólares, libras o yenes según la opción elegida por el usuario.
Funciones sugeridas:
double euroToDollar(euros), double euroToPound(euros), double euroToYen(euros) para las conversiones.
void showConversionMenu() para mostrar el menú de opciones.

Actividad 9: Planificador de eventos
Escribe un programa que pida al usuario el día y la hora de un evento en el futuro y calcule cuántos días y horas faltan desde el momento actual (introducido por el usuario).
Funciones sugeridas:
boolean validateDate(day, month, year) para validar la fecha.
void calculateTimeDifference(currentDay, eventDay) para obtener la diferencia en días y horas.

Actividad 10: Generador de recibos de compras
Crea un programa que reciba los precios de tres artículos y un porcentaje de impuestos, calcule el total antes de impuestos, los impuestos y el total a pagar.
Funciones sugeridas:
double calculateSubtotal(price1, price2, price3)
double calculateTaxes(subtotal, taxRate)
double calculateTotal(subtotal, taxes)
