docker network create redis-net

docker run --name fintech-redis \
          -p 6378:6378 \
          --network redis-net \
          -d redis:latest