USE bedtime_tracker;

CREATE TABLE prize (
    prize_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500) DEFAULT NULL,
    image_url VARCHAR(2048) DEFAULT NULL,
    priority INT DEFAULT NULL,
    
    PRIMARY KEY (prize_id)
);
