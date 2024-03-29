USE bedtime_tracker;

CREATE TABLE bedtime (
    bedtime_id INT AUTO_INCREMENT NOT NULL,
    child_id INT NOT NULL,
    sleep_start DATETIME NOT NULL,
    sleep_end DATETIME NOT NULL,
    success BOOLEAN NOT NULL,
    is_nap BOOLEAN NOT NULL,
    
    PRIMARY KEY (bedtime_id),
    CONSTRAINT fk_bedtime_child FOREIGN KEY (child_id) REFERENCES child(child_id)
);
