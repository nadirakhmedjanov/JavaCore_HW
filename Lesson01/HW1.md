## Домашнее задание №1: Создать docker-контейнер для формирования полной документации по проекту

Dockerfile:
```Dockerfile
# Загружаем образ с JDK 11
FROM openjdk:11

# Определяем директорию для работы
WORKDIR /prokect

# Копируем первичный код проекта в контейнер
COPY ./src /project/src

# Создаем отдельную папку для документирования
RUN mkdir -p /workdocs

# Генерируем документацию для всех пакетов
RUN javadoc -d /docs -sourcepath ./src -subpackages ru

# Указываем входную дефолтную точку 
CMD ["javadoc"]
```
Используемые команды в терминале:
```bash
docker build -t javadoc-generator .
```
```bash
docker run --rm -v $(pwd)/docs:/docs javadoc-generator
```