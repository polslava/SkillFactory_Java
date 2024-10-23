
CREATE TABLE operations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    target_user_id BIGINT,  -- Новый столбец для учёта пользователя, которому переводятся деньги
    operation_type INT,
    amount INT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (target_user_id) REFERENCES users(id)
);