CREATE TABLE IF NOT EXISTS champions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    lore TEXT,
    image_url VARCHAR(255)
    );

INSERT INTO champions (name, role, lore, image_url) VALUES
    ('Jinx', 'Shooter', 'An impulsive and maniacal criminal from Zaun, Jinx lives to spread chaos without worrying about the consequences. With an arsenal of deadly weapons, she detonates the loudest and brightest explosions to leave a trail of destruction and panic wherever she goes. Jinx abhors boredom and happily leaves her chaotic brand of pandemonium wherever she goes.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jinx_0.jpg'),
    ('Vi', 'Fighter', 'A former criminal from the violent streets of Zaun, Vi is a fearsome, impulsive and explosive woman who has very little respect for authorities. After growing up completely alone, Vi developed extremely accurate survival instincts and an extremely acidic sense of humor. Now working with the Piltover Watch to keep the peace, she wields powerful hextech gauntlets capable of crushing walls and suspects with equal ease.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Vi_0.jpg'),
    ('Ekko', 'Assassin', 'A prodigy from the violent streets of Zaun, Ekko manipulates time to turn any situation in his favor. Using his own invention, the Revo-Z, he explores the possible forks of reality to create the perfect moment. Although he greatly values his freedom, when something threatens his friends, he goes to great lengths to defend them. To mere observers, Ekko always seems to achieve the impossible the first time.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ekko_0.jpg'),
    ('Caitlyn', 'Shooter', 'Known as its best peacemaker, Caitlyn is also Piltover\'s best choice to rid the city of its elusive criminal elements. She is often paired with Vi, acting as a calming counterpoint to her partner\'s impetuous nature. Even though she carries a unique hextech rifle, Caitlyn\'s most powerful weapon is her superior intellect, which allows her to lay elaborate traps for any outlaws foolish enough to operate in the City of Progress.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Caitlyn_0.jpg'),
    ('Jayce', 'Fighter', 'Jayce is a brilliant inventor who has dedicated his life to defending Piltover and its relentless pursuit of progress. With his transforming hextech hammer in hand, Jayce uses his strength, courage, and considerable intelligence to protect his hometown. Although he is hailed by the town as a hero, he doesn\'t much like the attention that heroism brings. Still, Jayce\'s heart is in the right place and even those who envy his natural abilities are grateful for the way he protects the City of Progress.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jayce_0.jpg'),
    ('Viktor', 'Wizard', 'Viktor, the herald of a new age of technology, has devoted his life to the advancement of humanity. An idealist who seeks to elevate the people of Zaun to a new level of understanding, he believes that only by accepting the glorious evolution of technology will it be possible for humanity to reach its true potential. With a body enhanced by steel and science, Viktor is zealous in his pursuit of this bright future.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Viktor_0.jpg'),
    ('Heimerdinger', 'Wizard', 'A brilliant, if eccentric, scientist, Professor Cecil B. Heimerdinger is one of the most innovative and esteemed inventors Piltover has ever known. Tireless in his work to the point of neurotic obsession, he seeks to answer the universe\'s most impenetrable questions. Although his theories often seem obscure and esoteric, Heimerdinger produced some of Piltover\'s most miraculous, not to mention lethal, machines and constantly tweaked his inventions to make them even more efficient.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Heimerdinger_0.jpg'),
    ('Singed', 'Tanque', 'Singed is a Zaunite alchemist of unparalleled intellect, who has devoted his life to pushing the limits of knowledge; and no price, not even your own sanity, is too high. Is there a cure for your madness? Mixes of his rarely fail, but for many, Singed has lost any sense of humanity, leaving a toxic trail of misery and terror in his wake.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Singed_0.jpg'),
    ('Ryze', 'Wizard', 'Considered by the vast majority to be the most skilled mage in Runeterra, Ryze is an ancient and bitter archmage who carries enormous weight. Endowed with enormous arcane power and a remarkable physical structure, he tirelessly searches for the Global Runes, which are fragments of pure magic that once created the world out of nothing. He must recover these artifacts before they fall into the wrong hands, for Ryze knows well the horrors they can inflict on Runeterra.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ryze_0.jpg'),
    ('Master Yi', 'Assassin', 'Master Yi trained his body and sharpened his mind so that thought and action became almost one. Although he prefers to resort to violence as a last resort, the lightness and speed of his sword guarantee a swift resolution. As one of the last practitioners of the Ionian art of Wuju, Yi dedicated his life to preserving his people\'s legacy, evaluating potential disciples with the Seven Lenses of Insight to identify which of them was the most worthy.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/MasterYi_0.jpg'),
    ('Garen', 'Fighter', 'A noble and proud warrior, Garen is part of the Fearless Vanguard. Popular among his companions and respected enough by his enemies, his reputation is nothing more than expected of an heir to the prestigious Stemmaguard family, charged with defending Demacia and its ideals. Clad in magic-resistant armor and wielding a powerful sword, Garen is always ready to confront wizards and sorcerers on the battlefield, in a true hurricane of virtuous steel.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Garen_0.jpg'),
    ('Teemo', 'Shooter', 'Indifferent to even the most dangerous and threatening obstacles, Teemo searches the world with infinite enthusiasm and excitement. A yordle with unshakable morals who prides himself on following the Bandópolis Scout Code, sometimes with so much dedication that he is unaware of the possible consequences of his actions. Although some doubt the existence of the Boy Scouts, one thing is certain: one should never doubt Teemo\'s convictions.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Teemo_0.jpg');