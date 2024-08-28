#!/bin/sh

echo "Waiting for mysql..."

while ! nc -z db 3306; do
  sleep 0.1
done

echo "MySQL started"

exec "$@"
