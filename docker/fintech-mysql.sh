docker run -d \
--name fintech-mysql \
-e MYSQL_ROOT_PASSWORD="1" \
-e MYSQL_USER="fintech" \
-e MYSQL_PASSWORD="fintech" \
-e MYSQL_DATABASE="fintech" \
-p 3308:3308 \
mysql:latest