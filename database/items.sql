CREATE TABLE `items` (
     `itemid` varchar(255) NOT NULL DEFAULT 'none',
     `dateAdded` date DEFAULT NULL,
     `dateUpdated` date DEFAULT NULL,
     `name` varchar(255) DEFAULT NULL,
     `asins` varchar(255) DEFAULT NULL,
     `brand` varchar(255) DEFAULT NULL,
     `categories` varchar(2083) DEFAULT NULL,
     `primaryCategories` varchar(255) DEFAULT NULL,
     `imageURLs` text,
#      `keys` varchar(2083) DEFAULT NULL,
     `manufacturer` varchar(255) DEFAULT NULL,
     `manufacturerNumber` varchar(255) DEFAULT NULL,
     PRIMARY KEY (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8