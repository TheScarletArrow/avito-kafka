# avito-kafka
Учебный проект с использованием Kafka. Producer отправляет JSON вида: <br>
a. Первый вид json `{"type": "message"}` <br>
b. Второй вид json `{"type": "error"}`
Consumer в зависимости от json делает следующее: <br>
a. Если вычитанное сообщение `{"type": "message"}`, то в консоль 
пишется "Done!"<br>
b. Если вычитанное сообщение не `{"type": "message"}`, то оно 
помещается в dead letter
