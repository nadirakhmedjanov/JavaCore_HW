## Домашнее задание №1: Создать docker-контейнер для формирования полной документации по проекту

Dockerfile:
```Dockerfile
# Используем базовый образ с JDK 11
FROM openjdk:11

# Устанавливаем рабочую директорию
WORKDIR /prokect

# Копируем исходный код проекта в контейнер
COPY ./src /project/src

# Создаем папку для документации
RUN mkdir -p /workdocs

# Генерируем документацию для всех пакетов
RUN javadoc -d /docs -sourcepath ./src -subpackages ru

# Указываем точку входа по умолчанию
CMD ["javadoc"]
```
Команды в терминале:
```bash
docker build -t javadoc-generator .
```
```bash
docker run --rm -v $(pwd)/docs:/docs javadoc-generator
```