
CREATE TABLE operations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    operation_type INT,
    amount INT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id)
);