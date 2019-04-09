package com.formation.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.domain.Hotel;

@ManagedBean(name="service")
@ApplicationScoped
public class HotelServiceImpl implements HotelService {

		public static List<Hotel> tokyoH;
	    public static List<Hotel> osakaH;
	    public static List<Hotel> kyotoH;
	    
	    public static List<Hotel> seoulH;
	    public static List<Hotel> busanH;
	    public static List<Hotel> jejuH;
	    
	    public static List<Hotel> pekinH;
	    public static List<Hotel> hongKongH;
	    public static List<Hotel> shangaiH;
	    
	    public static List<Hotel> bangkokH;
	    public static List<Hotel> phuketH;
	    public static List<Hotel> chiangRaiH;

		private static int i=1;
		
		

	    @PostConstruct
	    private void init() {
	        tokyoH = new ArrayList<Hotel>();
	        
	        tokyoH.add(new Hotel(i++, "tokyo1", "Daiwa Roynet Hotel Nishi-Shinjuku", "Shinjuku-ku, Tokyo", "01 02 03 04 05", "Nishi-Shinjuku@hotel.com", 137, 4,
					"Le Daiwa Roynet Hotel Nishi-Shinjuku propose un hébergement 3 étoiles avec un salon commun à Tokyo. Bien situé dans le district de Shinjuku, l'établissement se trouve à 2,1 km du jardin impérial de Shinjuku et à 2,4 km du sanctuaire Meiji Jingu. "
					+ "Vous serez aussi à 3,3 km du stade Meiji Jingu et du NHK Studio Park. Les logements sont équipés d'une télévision à écran plat, d'une salle de bains privative avec une baignoire et d'un réfrigérateur. "
					+ "Lors de votre séjour au Daiwa Roynet Hotel Nishi-Shinjuku, vous pourrez savourer un petit-déjeuner buffet. Le personnel de la réception ouverte 24h/24 parle japonais et anglais. Le centre-ville de Shibuya se trouve à 4 km de l'hébergement, "
					+ "tandis que la statue de Hachiko est à 4 km. L'aéroport international de Tokyo-Haneda est à 23 km. Ce quartier (Arrondissement de Shinjuku) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : "
					+ "le shopping, les habitants chaleureux et la nourriture. Les couples apprécient particulièrement l'emplacement de cet établissement."));
	        
	        tokyoH.add(new Hotel(i++, "tokyo2","Super Hotel Lohas Akasaka", "Minato-ku Akasaka, Tokyo", "01 06 07 08 09", "Lohas-Akasaka@hotel.com", 125, 5, 
					"Ouvert en mars 2015, le Super Hotel Lohas Akasaka est idéalement situé dans le centre de Tokyo, à seulement 4 minutes à pied de la station de métro Akasaka. Cet établissement non-fumeurs dispose de bains publics spacieux et d'une connexion Wi-Fi gratuite."
					+ "Toutes les chambres du Super Hotel Lohas Akasaka sont équipées d'installations modernes telles qu'une télévision à écran plat de 81 cm, des films à la carte et un purificateur/humidificateur d'air. Leur salle de bains privative est pourvue d'une baignoire, d'un sèche-cheveux et d'articles de toilette gratuits. Un étage est réservé aux femmes."
					+ "D'autre part, le Super Hotel Lohas Akasaka possède une laverie automatique et des ordinateurs avec connexion Internet dans les parties communes. Vous trouverez par ailleurs des distributeurs automatiques de boissons sur place."
					+ "Vous rejoindrez plusieurs stations de métro telles qu'Akasaka Mitsuke, Nagatacho et Tameike Sanno en moins de 10 minutes de marche. D'autre part, les quartiers populaires de Shibuya et Ginza sont accessibles en moins de 10 minutes de métro à partir de la station d'Akasaka."
					+ "Enfin, un petit-déjeuner simple est servi dans la salle à manger, au deuxième étage."
					+ "Ce quartier (Arrondissement de Minato) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : des rues propres, les habitants chaleureux et la culture."));
	        
	        osakaH = new ArrayList<Hotel>();
	        
	        osakaH.add(new Hotel(i++, "osaka1", "Hotel Keihan Universal Tower", "Konohana-ku Shimaya, Osaka", "01 10 11 12 13", "Keihan-Universal@hotel.com", 85, 4, 
					"L'Hotel Keihan Universal Tower vous accueille à 300 mètres du parc à thème Universal Studios Japan. Vous y trouverez le spa S-PARK, au 31ème étage, avec sauna, jacuzzi et bains thermaux offrant une vue sur la ville. Vous bénéficierez gratuitement d'une connexion Wi-Fi dans l'ensemble des locaux."
					+ "Les chambres de l'Hotel Keihan Universal Tower possèdent une grande fenêtre et sont décorées dans tons neutres, rehaussés par des boiseries. Toutes sont dotées d'une télévision à écran plat de 94 cm. Leur salle de bains privative est pourvue d'une baignoire, d'articles de toilette, d'une brosse à dents, d'un sèche-cheveux et de chaussons."
					+ "Des services de massage, de change et de bagagerie sont disponibles à la réception ouverte 24h/24."
					+ "Le restaurant Garden propose un buffet toute la journée composé de plats japonais et occidentaux. Surplombant les toits d'Osaka depuis le 32ème étage, le Top of Universal sert des plats pour le dîner."
					+ "L'hôtel se trouve à 1h10 en bus limousine de l'aéroport de Kansai et à 45 minutes en bus express de celui d'Itami. Vous rejoindrez la gare JR d'Osaka en 15 minutes en train."));
	        
	        osakaH.add(new Hotel(i++, "osaka2", "The Park Front Hotel at Universal Studios Japan TM", "Konohana-ku, Osaka", "01 14 15 16 17", "Park-Front@hotel.com", 129, 4, 
					"Inauguré le 1er août 2015, le Park Front Hotel at Universal Studios Japan TM est l'établissement officiel Universal Studios Japan le plus récent. Il se trouve à quelques pas de l'entrée du parc à thèmes, de la gare Universal City et du centre commercial Universal CityWalk Osaka™. Il dispose d'un parking privé, de plusieurs cafés, restaurants et boutiques sur place ainsi que d'une connexion Wi-Fi gratuite dans l'ensemble de ses locaux."
					+ "En train, la gare Universal City est à 12 minutes de celle d'Osaka (JR) et à 20 minutes de celle de Shin-Osaka (JR) desservie par les trains à grande vitesse. Le service de navette en bus-limousine depuis l'aéroport international d'Osaka vers l'établissement prend 45 minutes. Depuis celui du Kansai, il dure 1 heure et 10 minutes. En voiture, vous atteindrez Osaka en environ 20 minutes par l'autoroute Hanshin Expressway."
					+ "L'établissement propose une réception ouverte 24h/24, une bagagerie et des services de massage. Moyennant des frais supplémentaires, vous profiterez d'une laverie automatique au 2ème étage. Sur place, vous bénéficierez également d'un café, d'une crêperie, d'un bar de yaourt glacé, d'une pizzeria et d'une supérette."
					+ "Toutes les chambres sont munies d'un purificateur/humidificateur d'air, de la climatisation, d'une télévision par satellite à écran plat, d'un bureau, d'un coin salon ainsi que d'une salle de bains privative avec une baignoire, une douche, des chaussons, un sèche-cheveux et des articles de toilette gratuits. Les hébergements insonorisés incluent un réfrigérateur et des casiers personnels."
					+ "Présentant une décoration sur le thème hawaïen, le restaurant Buffet Dining Akala sur place sert un grand choix de plats internationaux, notamment chinois, occidentaux et japonais. Il est ouvert pour le petit-déjeuner, le déjeuner et le dîner."));
	        
	        kyotoH = new ArrayList<Hotel>();
	        
	        kyotoH.add(new Hotel(i++, "kyoto1", "Kyoto Hana Hotel", "Higashiyama-ku, Kyoto", "01 18 19 20 21", "Kyoto-Hana@hotel.com", 127, 3, 
					"Situé dans la rue Sanjo-kai, le Kyoto Hana Hotel se tient à seulement 1 minute à pied des stations de métro Sanjo et Sanjo-Keihan. Les quartiers populaires de Gion et de Ponto-cho vous attendent à tout juste 10 minutes à pied. Entièrement non-fumeurs, cet établissement propose une connexion Wi-Fi gratuite dans l'ensemble des locaux et une réception ouverte 24h/24."
					+ "Décorées dans des tons naturels, les chambres climatisées du Kyoto Hana Hotel sont dotées d'une télévision à écran plat, d'un réfrigérateur et d'une bouilloire électrique. Leur salle de bains privative est pourvue d'un sèche-cheveux et d'articles de toilette gratuits. Les serviettes sont fournies. Les femmes bénéficieront d'un démaquillant, de lait de toilette et de bonnets de douche à l'arrivée."
					+ "Deux ordinateurs portables sont disponibles gratuitement dans le hall. Le personnel du Kyoto Hana Hotel se fera un plaisir de vous aider à organiser vos visites des attractions locales et à réserver des restaurants."
					+ "Sur place, vous pourrez profiter d'un distributeur automatique de boissons. Un petit-déjeuner buffet avec des viennoiseries danoises fraîchement sorties du four et des plats japonais sont servis dans le salon du rez-de-chaussée. Dans les environs de l'hôtel, vous trouverez un éventail de restaurants traditionnels et internationaux."
					+ "Le Hana Hotel est installé à 5 minutes de train du château de Nijojo. Accessible en 10 minutes à pied, la station Gion-Shijo est à proximité de la rue Shijo où vous découvrirez le quartier traditionnel des geishas. Le temple Honno-ji et le sanctuaire de Yasaka-jinja sont tous 2 à environ 15 minutes de marche de l'hôtel. Vous pourrez vous rendre au sanctuaire de Fushimi Inari-taisha en 20 minutes en train sur la ligne Keihan. En bus, vous rejoindrez le temple Kiyomizu-dera en 20 minutes et le temple Ginkaku-ji en 30 minutes."
					+ "Ce quartier (Higashiyama-ku) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : l'exploration de la vieille ville, la marche à pied et les monuments anciens."));
	        
	        kyotoH.add(new Hotel(i++, "kyoto2", "Hotel Keihan Kyoto Grande", "Minami-ku Higashikujyo, Kyoto", "01 22 23 24 25", "Keihan-Grande@hotel.com", 184, 5, 
					"L'Hotel Keihan Kyoto est directement relié à la gare JR de Kyoto par un passage souterrain. Il propose des services de massage et une réception ouverte 24h/24. Ses chambres modernes bénéficient toutes d'une connexion Wi-Fi gratuite."
					+ "Les chambres sont équipées de la climatisation et du chauffage. Toutes comprennent une bouilloire électrique, un réfrigérateur et une télévision à écran plat. Leur salle de bains privative est pourvue d'une baignoire et d'articles de toilette. Vous profiterez notamment d'une brosse à dents, d'un sèche-cheveux et de chaussons."
					+ "Le Kyoto Keihan Hotel se trouve à 10 minutes à pied du temple Higashi Hongan-ji et à 15 minutes de marche de celui de To-ji. Le bus-limousine rejoint l'aéroport international de Kansai en 2 heures et l'aéroport d'Itami en 1 heure, depuis un arrêt situé juste en face de l'établissement."
					+ "Une bagagerie et un service de nettoyage à sec sont à votre disposition à la réception. Au restaurant Octavar, vous pourrez déguster une cuisine méditerranéenne accompagnée de vins fins. Un distributeur automatique de boissons est en outre disponible sur place. Vous pourrez aussi consulter les guides de Kyoto dans les parties communes. Une machine d'échange de devises est installée sur place."
					+ "Ce quartier (Minami Ward) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les temples, les visites et l'histoire."));
	    
	        
	        seoulH = new ArrayList<Hotel>();
            
            seoulH.add(new Hotel(i++, "seoul1", "L7 Hongdae by LOTTE", "HongDae, Séoul", "01 02 03 04 05", "Hongdae@hotel.com", 208, 4, 
            		"Situé dans le quartier de Mapo-gu, à Séoul, le L7 Hongdae propose des chambres 4 étoiles dotées d'une connexion Wi-Fi gratuite. Cet établissement comprend une salle de sport, un bar et un restaurant. "
            		+ "Toutes les chambres sont climatisées et comprennent une télévision par satellite à écran plat, une bouilloire, un bidet, des articles de toilette gratuits et une armoire. Leur salle de bains privative est pourvue d’un sèche-cheveux. Toutes les chambres sont également équipées d'un réfrigérateur. Un petit-déjeuner à la carte est servi sur place. Cet hôtel comporte un centre d'affaires. Lors de votre séjour au L7 Hongdae, vous pourrez profiter de la piscine sur le toit, accessible en saison, moyennant des frais supplémentaires. Le personnel de la réception ouverte 24h/24 parle anglais et japonais. Le centre commercial I'Park Mall se trouve à 5 km."
            		+ "Ce quartier (Mapo-gu) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les cafés, les magasins de vêtements et les boutiques de maquillage."));
            
            seoulH.add(new Hotel(i++, "seoul2", "aFIRST Hotel Myeongdong", "Jung-gu, Séoul", "01 06 07 08 09", "Myeongdong@hotel.com", 80, 4,
            		"Situé à 4 minutes à pied de la sortie 1 de la station de métro Euljiro 1-GA (ligne 2), l’établissement a First Myeongdong se trouve à 5 minutes de l’hôtel de ville de Séoul. Vous bénéficierez gratuitement d’une connexion Wi-Fi et d’un parking privé sur place. Toutes les chambres disposent d’une télévision à écran plat, d’un minibar, d’une bouilloire électrique, d’un réfrigérateur, d’un coffre-fort, d’un bureau, d’un canapé, de moquette et de la climatisation. Les salles de bains comprennent des toilettes avec un bidet électronique, un sèche-cheveux, un peignoir et des Articles de toilette gratuits. "
            		+ "La réception ouverte 24h/24 assure des services de bagagerie, de change et de concierge. Un centre de remise en forme et une salle de conférence sont également à votre disposition. Le restaurant sur place sert un petit-déjeuner continental et un menu à la carte pour le déjeuner et le dîner. Le célèbre Palais Deoksugung se trouve à 9 minutes à pied et le Palais Gyeongbokgung est à 19 minutes à pied de l’A First Myeongdong. L’aéroport international de Gimpo est à 42 minutes en voiture et l’aéroport d’Incheon est à 63 minutes en voiture. "
            		+ "Ce quartier (Jung-gu) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les boutiques de maquillage, le shopping et les magasins de vêtements.<"));
            
            busanH = new ArrayList<Hotel>();
            
            busanH.add(new Hotel(i++, "busan1", "Hilton Busan", "Gijang-Gun, Busan", "01 10 11 12 13", "Hilton-Busan@hotel.com", 162, 5,
            		"Installé à Busan, à 6 km de la colline de Dalmaji, le Hilton Busan comprend des installations de sports nautiques, une salle de sport, un jardin, une terrasse et un restaurant servant des grillades préparées sur le barbecue et des plats chinois. Il assure aussi un service de navette gratuit. Tous les logements du Hilton Busan incluent un coin salon, une télévision par câble à écran plat, une salle de bains privative, la climatisation et un bureau. "
            		+ "Certains disposent d'un balcon. Chaque matin, l'établissement prépare un petit-déjeuner buffet. Dans les environs du Hilton Busan, vous pourrez pratiquer la randonnée. Parlant anglais et japonais, le personnel de la réception vous aidera à organiser votre séjour. La plage de Haeundae et l'aquarium Sea Life Busan sont à 8 km. "
            		+ "Ce quartier (Gijang-Gun) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les balades le long de la côte, la relaxation et les balades sur la plage."));
            
            busanH.add(new Hotel(i++, "busan2", "Hotel Kyungsung", "Busanjin-Gu, Busan,", "01 14 15 16 17", "Kyungsung@hotel.com", 130, 4,
            		"Doté d’une connexion Wi-Fi gratuite, l’Hotel Kyungsung propose des chambres à Busan, à 500 mètres du marché de Bujeon et à 700 mètres de la rue médicale Seomyeon. Cet hôtel 3 étoiles dispose d’une réception ouverte 24h/24 et d’un centre d’affaires. L’établissement est situé dans le quartier Busanjin-Gu, à 700 mètres de Seomyeon. Les logements de l’hôtel sont équipés d’un coin salon. Toutes les chambres sont équipées de la climatisation et certaines possèdent également une terrasse. Tous les logements comprennent un réfrigérateur. "
            		+ "Le petit-déjeuner est servi le week-end à l’Hotel Kyungsung. L’établissement propose également des installations d’affaires telles qu’un fax et une photocopie. L’Université Kyungsung est à 4,3 km de l’Hotel Kyungsung."
            		+ "Ce quartier (Busanjin-gu) est un choix idéal pour les voyageurs qui s’intéressent à ces thèmes: les habitants chaleureux, le shopping et la nature."));
            					
            jejuH = new ArrayList<Hotel>();
            
            jejuH.add(new Hotel(i++, "jeju1", "The Shilla Jeju", "Jungmun Beach, Seogwipo", "01 18 19 20 21", "Shilla-Jeju@hotel.com", 266, 5,
            		"L'établissement The Shilla Jeju est situé à 10 minutes à pied de la célèbre plage de Jungmun. Il propose 6 restaurants, un club de sport entièrement équipé avec 2 piscines thermales et un sauna, ainsi qu'un spa de luxe et un centre d'affaires doté d'une connexion Wi-Fi gratuite. Les chambres climatisées offrent une vue sur le mont Halla ou l'océan. Chacune est équipée d'une télévision par câble à écran plat, d'un minibar et d'un coffre-fort. Lors de votre séjour, vous disposerez de piscines intérieure et extérieure, ainsi que d'un jacuzzi dans le club de sport, ouvert gratuitement toute l'année. "
            		+ "Les plus jeunes bénéficieront gratuitement d'une salle de jeux pour enfants et un service de prêt de poussettes est aussi assuré. Les personnes avec un passeport international profiteront d'un casino sur place. De plus, The Shilla Jeju est doté d'un parking gratuit. Par ailleurs, le restaurant Cheonjee vous servira des mets coréens raffinés et des plats de Jeju uniques, tandis que le restaurant Hinode au 3ème étage prépare une cuisine japonaise traditionnelle. Vous aurez également la possibilité de déguster un buffet tout au long de la journée au restaurant Park View. "
            		+ "Enfin, l'hôtel The Shilla Jeju se trouve à 10 minutes en voiture du jardin botanique Yeomiji et à 50 minutes de route de l'aéroport international de Jeju."
            		+ "Ce quartier (Jungmun Beach) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les musées, la relaxation et la plage."));
            
            jejuH.add(new Hotel(i++, "jeju2", "Lotte Hotel Jeju", "Jungmungwangwang-ro, Seogwipo", "01 22 23 24 25", "Jeju-Lotte@hotel.com", 228, 5,
            		"Situé sur l'île de Jeju, le Lotte Hotel Jeju dispose d'un complexe de divertissement comprenant un casino. Il propose de spacieux hébergements dotés d'un balcon avec vue sur la nature environnante. Un parking gratuit est disponible. Les chambres disposent d'une télévision par câble à écran plat, Elles comportent aussi un minibar, un plateau/bouilloire et un coffre-fort. Vous profiterez d'une vue sur l'océan ou sur la montagne. "
            		+ "Des bouteilles d'eau gratuites, des peignoirs et des chaussons sont également fournis. L'établissement compte des piscines intérieure et extérieure, ainsi qu'un jacuzzi dans la salle de sport accessibles gratuitement pendant votre séjour. Les enfants pourront profiter de toute une variété d'activités intérieures ou extérieures, et notamment d'un bassin pour enfants et d'une salle de jeux. De plus, un service de prêt de poussettes est assuré. Le restaurant en plein air Lake Plaza sert un buffet international. L'établissement possède 6 autres restaurants, tels que le Mu Gung Hwa qui sert des plats coréens et le Momoyama qui propose des plats japonais et chinois. "
            		+ "Le Lotte Hotel Jeju se trouve à 400 mètres du musée de l'ours en peluche. La plage de Jungmun Saekdal se tient à 10 minutes à pied de l'hôtel. Vous rejoindrez l'aéroport international de Jeju en 50 minutes de route."
            		+ "Ce quartier (Jungmun Beach) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les musées, la relaxation et la plage."));
            
            
            pekinH = new ArrayList<Hotel>();
            
            pekinH.add(new Hotel(i++, "pekin1", "Beijing Prime Hotel Wangfujing", "Dongcheng, Pékin", "01 02 03 04 05", "Bejin-Wangfujing@hotel.com ", 177, 4,
            		"Situé sur la rue Wangfujing, le Beijing Prime Hotel Wangfujing dispose de 5 restaurants, d'une piscine intérieure et d'un parking gratuit. Ses chambres bénéficient d'une connexion Wi-Fi gratuite et d'une vue sur la ville. Vous séjournerez à 5 minutes à pied du centre culturel Jiade et du musée d'Art national de Chine. La station de métro Dongsi (lignes 5 et 6) est à environ 8 minutes de marche. En voiture, le Prime Hotel se trouve à 5 minutes de la Cité interdite, à 8 minutes de la place Tian'anmen et du musée national de Chine, à 11 minutes du parc Beihai et à 45 minutes de l'aéroport international Beijing Capital. La gare ferroviaire de Pékin est à environ 15 minutes de route. Les chambres du Prime sont équipées de la climatisation et du chauffage. Chacune comprend une télévision par câble à écran plat, un coffre-fort et un sèche-cheveux. Un minibar et un plateau/bouilloire sont également fournis. Le restaurant de l'hôtel, l'Emperor, vous propose une cuisine locale dans un cadre inspiré de la Cité interdite. Le restaurant-grill Elysee sert des plats français. Vous pourrez aussi déguster des spécialités internationales au café et prendre un verre dans l'un des bars de l'hôtel. L'Hotel Prime possède une salle de sport et un institut de beauté. Vous pourrez profiter du sauna ou vous détendre avec un massage au spa. Rendez-vous au karaoké de l'hôtel pour chanter sans modération ou au bureau d'excursions situé dans le hall pour organiser vos déplacements. Un service de location de vélos est également disponible pour partir à la découverte des environs."
            		+ "Ce quartier (Dongcheng) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les monuments, les visites et les temples."));
            
            pekinH.add(new Hotel(i++, "pekin2", "New World Beijing Hotel", "adresse2", "01 06 07 08 09", "NeW-Beijing@hotel.com", 188, 5,
            		"Situé à environ 15 minutes à pied du temple du Ciel, le New World Beijing Hotel propose des chambres avec connexion Wi-Fi. Il possède une piscine intérieure, un centre de spa, une salle de sport ainsi qu'un centre d'affaires avec des salles de réunion et de banquet. Vous séjournerez à 8 minutes de route de la place Tian'anmen et à 10 minutes à pied de la station de métro Chongwenmen (lignes 2 et 5). En voiture, vous rejoindrez la gare de Pékin en 10 minutes, l'aéroport international de la ville en environ 45 minutes et la célèbre rue des bars de Sanlitun en 22 minutes. Donnant sur la ville, les chambres possèdent une télévision par satellite à écran plat, une station d'accueil pour iPod, un coffre-fort, du matériel de repassage, un bureau et un coin salon doté d'un canapé. Leur salle de bains privative est pourvue d'une baignoire, d'une douche et de peignoirs moelleux. Vous bénéficierez d'un sauna, de massages apaisants, d'une salle de sport et d'une piscine intérieure. Pour davantage de confort, des services de change, de concierge et de bagagerie sont dispensés. Le bureau d'excursions assure un service de location de voitures et de billetterie. L'établissement comporte 2 restaurants. Le Tian Tan Kitchen sert un buffet tout au long de la journée, tandis que le No.8 Qi Nian prépare une cuisine cantonaise et des mets typiques du Sichuan. Vous apprécierez aussi des rafraîchissements au bar YIN on 12, installé sur le toit. Pour une expérience gastronomique maximale à Pékin, vous trouverez une variété de restaurants locaux à quelques minutes de marche."
            		+ "Ce quartier (Dongcheng) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : les monuments, les visites et les temples."));
            
            hongKongH = new ArrayList<Hotel>();
            
            hongKongH.add(new Hotel(i++, "hongKong1", "Hotel Tsim Sha Tsui", "Tsim Sha Tsui Kowloon, Hong Kong", "01 10 11 12 13", "Tsim-Sha-Tsui@hotel.com", 212, 5,
            		"Situé ans le quartier de Tsim Sha Tsui à Hong Kong, à 600 mètres du centre commercial Mira Place 1, le Page148 Boutique Hotel Tsim Sha Tsui propose des chambres climatisées, une réception ouverte 24h/24, un service de concierge ainsi qu'un restaurant. Toutes les chambres sont équipées d'une télévision par satellite à écran plat, d'un réfrigérateur, d'une bouilloire et d'une armoire. Elles comprennent aussi une salle de bains privative pourvue d'une douche et d'articles de toilette gratuits, une vue sur le jardin et un coin salon. Le Mira Place 2 est à 600 mètres du Page148, tandis que Kowloon Park se trouve à 1,1 km. Vous séjournerez à 5 minutes à pied de la sortie D de la station de métro Jordan. "
            		+ "Ce quartier (Tsim Sha Tsui) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : le shopping de luxe, le shopping et les magasins de vêtements."));
           
            hongKongH.add(new Hotel(i++, "hongKong2", "Island Shangri-La Hong Kong", "Suprem Court road, Hong Kong", "01 14 15 16 17", "Shangri-La@hotel.com", 334, 5,
            		"Haut de 56 étages qui dominent le complexe commercial Pacific Place à Central, l'Island Shangri-La Hong Kong propose des hébergements luxueux, un restaurant étoilé au guide Michelin, un spa, une piscine extérieure et une salle de sport ouverte 24h/24. Élégamment décorées avec un mobilier de style oriental, les chambres sont spacieuses. Elles sont dotées de baies vitrées donnant sur le Victoria Peak et le port. Elles sont toutes équipées d'une connexion Wi-Fi gratuite, d'une télévision à écran plat et d'un minibar. Un service de majordome est assuré 24h/24. Lors de votre séjour, vous pourrez profiter de cours de hatha yoga, d'une piscine extérieure et de massages relaxants au centre de bien-être du Island Shangri-La. Des services de blanchisserie et de limousine sont disponibles. Les restaurants primés de l'Island Shangri-La comprennent un restaurant étoilé au guide Michelin, le Summer Palace Cantonese. "
            		+ "Ce quartier (Centre de Hong Kong) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : la vie nocturne, les restaurants et la gastronomie."
            		+ "Ce quartier est aussi idéal pour le shopping, avec des magasins célèbres comme : Cartier, Gucci, Tiffany & Co, Hermès, Chanel."));
            
            shangaiH = new ArrayList<Hotel>();
            
            shangaiH.add(new Hotel(i++, "shangai1", "The Sukhothai Shanghai", "Jing'an, Shanghai", "01 18 19 20 21", "Sukhothai@hotel.com", 212, 5,
            		"L'établissement The Sukhothai Shanghai est situé à Shanghai, à 1,2 km de la place du Peuple. Installé à proximité des attractions telles que la rue piétonne East Nanjing Road, il propose une réception ouverte 24h/24, un service de concierge, une salle de sport, un bar et un restaurant. Toutes les chambres comprennent la climatisation, une connexion Wi-Fi gratuite, une télévision par satellite à écran plat, un bureau, un coin salon, un réfrigérateur et une machine à café. Leur salle de bains privative est pourvue d'un jacuzzi, d'une baignoire, d'un sèche-cheveux et d'articles de toilette gratuits. Certaines chambres offrent une vue sur la ville. Pendant votre séjour, vous disposerez d'une salle de sport ouverte 24h/24, ainsi que d'options de restauration au rez-de-chaussée, notamment le café URBAN, le salon URBAN et le restaurant italien La Scala. Chaque matin, vous pourrez déguster un petit-déjeuner buffet ou continental sur place. Enfin, l'établissement The Sukhothai Shanghai se trouve à 1,4 km du quartier de Xintiandi et à 13 km de l'aéroport international de Shanghai Hongqiao, le plus proche."
            		+ "Ce quartier (Jing'an) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : la vie nocturne, la nourriture et les affaires."));
            
            shangaiH.add(new Hotel(i++, "shangai2", "Hyatt Regency Shanghai Global Harbor", "Ningxia Road Putuo District, Shanghai", "01 22 23 24 25", "Hyatt-Regency@hotel.com", 117, 4,
            		"Le Hyatt Regency Shanghai Global Harbour est intégré dans l'un des plus grands centres commerciaux et de divertissement de Shanghai, Global Harbour. Il dispose d'une piscine intérieure et d'un centre de spa et de bien-être. Une connexion Wi-Fi est disponible gratuitement dans l'ensemble des locaux. L'hôtel bénéficie d'un accès direct à la station de métro Jinshajiang Road, desservie par les lignes 3, 4 et 13 qui permettent de se déplacer facilement dans Shanghai. Le parc Zhongshan et le parc aquatique Changfeng Ocean World vous attendent à environ 10 minutes en voiture. Le zoo de Shanghai et le temple Jing'an sont accessibles en 20 minutes de route. L'aéroport international de Shanghai Hongqiao, le plus proche, se trouve à environ 30 minutes en voiture de l'établissement. Chaque logement est bien équipé avec la climatisation, une télévision à écran LED de 165 cm et une chaîne hi-fi Bluetooth. Toutes les chambres offrent une vue sur la ville. Des peignoirs, des chaussons et des articles de toilette gratuits sont fournis pour votre confort dans la salle de bains privative. L'établissement met à disposition 2 600 m² de salles de réunion et de réception, dont la Regency Ballroom, une salle de 900 m² avec jardin sur le toit et salles de réunion polyvalentes. Vous pourrez faire de l'exercice dans la salle de sport ouverte 24h/24, vous relaxer dans la piscine ou vous détendre dans le centre de spa. Vous trouverez 4 restaurants et un salon sur place. Le restaurant chinois Xiang Yue sert une authentique cuisine locale de Jiangnan, et vous pourrez déguster des plats de saison du monde entier au Market Café. Le bar sur le toit avec ses terrasses panoramiques est un lieu recherché pour apprécier des vins fins, des cocktails et des boissons. Un petit-déjeuner buffet est servi tous les matins."
            		+ "Ce quartier (Putuo) est un choix idéal pour les voyageurs qui s'intéressent à ces thèmes : la vie nocturne, les panoramas urbains et les balades en ville."));
            
            
            bangkokH = new ArrayList<Hotel>();
            
            bangkokH.add(new Hotel(i++, "bangkok1", "Praya Palazzo ", "Bangyeekhan, Bangkok", "01 02 03 04 05", "Praya-Palazzo@hotel.com", 97, 5,
            		"Description de l’hôtel : D’inspiration architecturale italienne, cet hôtel possède des chambres spacieuses et décorées à l’anciennes avec beaucoup de charme. Vous profiterez en famille d’une très belle piscine située le long du fleuve."
            		+ "Les plus : Wi FI gratuit. Parking gratuit."
            		+ "Les alentours : Idéalement situé, au calme. Vous n’aurez pas l’impression d’être en plein Bangkok mais juste totalement hors du temps… En plein quartier ancien et typique. Le Praya Palazzo est uniquement accessible par le fleuve."));
            
            bangkokH.add(new Hotel(i++, "bangkok2", "Hotel Clover Asoke", "Khlong Toei, Bangkok", "01 06 07 08 09", "Clover-Asoke@hotel.com", 84, 4,
            		"Description de l’hôtel : Idéal en  famille, joliment décorés, les appartements indépendants du Shama Sukhumvit sont immenses, très bien équipés. La literie est exceptionnelle. Il y a une salle de jeu pour enfants. Le personnel est top. La piscine à débordement  en étage est superbe. L’hôtel propose également un billard et un mini-golf. Il y a même des cours de yoga pour se détendre après la visite de la ville."
            		+ "Les plus : Wi Fi gratuit. Parking Gratuit. Garde d’enfants."
            		+ "Les alentours : Le Shama Sukhumvit Serviced Apartments se trouve à 5 minutes à pied de la station de métro aérien BTS Ploen Chit. Il est très bien  situé. Bangkok quartier moderne …et authentique à la fois!"));
            
            phuketH = new ArrayList<Hotel>();
            
            phuketH.add(new Hotel(i++, "phuket1", "Naiharn Garden Villa", "Nai Harn Beach, Muang Phuket", "01 10 11 12 13", "Naiharn-Garden@hotel.com", 101, 5,
            		"Description de l’hôtel : Superbes villas privées, Vous aurez le choix entre des villas d’une, de deux ou de trois chambres. Elles sont entièrement meublées et disposent de la climatisation. Elles comprennent également un salon, un espace détente extérieur . Chacune dotée de sa propre piscine et jardin. Idéale en famille."
            		+ "Les plus : Navette gratuite. Service garde d’enfants. Wi Fi gratuit."));
            
            phuketH.add(new Hotel(i++, "phuket2", "Baan Malinee", "Soi Baan Bangjo Bang, Phuket", "01 14 15 16 17", "Baan-Malinee@hotel.com", 90, 4,
            		"Des bungalows charmants nichés en plein jardin tropical. Le petit déjeuner est délicieux…Les chambres sont décorés avec goût et la piscine est chouette !"));
            
            chiangRaiH = new ArrayList<Hotel>();
            
            chiangRaiH.add(new Hotel(i++, "chiangRai1", "The Legend Chiang Rai Boutique River Resort & Spa", "A.Muang, Chiang Rai,", "01 18 19 20 21", "Legend-ChiangRai@hotel.com", 83, 5,
            		"Description de l’hôtel : Cet hôtel est splendide. Architecture Thaïlandaise très raffinée. Vous y serez bien en famille avec des chambres spacieuses  comprenant un grand salon avec vue sur le fleuve ou le jardin. Les douches extérieures sont en pierre naturelle. Piscine à débordement."
            		+ "Les plus : services de location de vélos et de voitures à disposition. Wi Fi gratuit."
            		+ "Les alentours : Cet hôtel est  idéalement situé au bord de la rivière Mae Kok. La ville de Chiang Rai et le club de golf de Mae Kok sont situés à moins de 2 km du Legend Chiang Rai Resort."));
            
            chiangRaiH.add(new Hotel(i++, "chiangRai2", "Banlomnov", "Robwiang Muang, Chiang Rai, ", "01 22 23 24 25", "Banlomnov@hotel.com", 31, 3,
            		"Description :  Chambres spacieuses dotées d’un coin salon. Très propres et tout confort."
            		+ "Les plus : Location de vélos. Parking gratuit. Une navette aéroport peut aussi être organisée sur demande."
            		+ "Les alentours : Au calme. Le Banlomnow se trouve à 500 mètres du Central Plaza Chiang Rai."));
    
	    }
	    
	    
	    //JAPON
	    public List<Hotel> findHotelTokyo() {
			return tokyoH;
		}
		
		public List<Hotel> findHotelOsaka() {
			return osakaH;
		}
		
		public List<Hotel> findHotelKyoto() {
			return kyotoH;
		}
	    

	    public List<Hotel> getTokyoH() {
	        return tokyoH;
	    }
	    
	    public List<Hotel> getOsakaH() {
	        return osakaH;
	    }
	    
	    public List<Hotel> getKyotoH() {
	        return kyotoH;
	    }
	    
	    
	    
	    //COREE
	    public List<Hotel> findHotelSeoul() {
			return seoulH;
		}
		
		public List<Hotel> findHotelBusan() {
			return busanH;
		}
		
		public List<Hotel> findHotelJeju() {
			return jejuH;
		}
	    

	    public List<Hotel> getSeoulH() {
	        return seoulH;
	    }
	    
	    public List<Hotel> getBusanH() {
	        return busanH;
	    }
	    
	    public List<Hotel> getJejuH() {
	        return jejuH;
	    }
	    
	    
	    
	  //CHINE
	    public List<Hotel> findHotelPekin() {
			return pekinH;
		}
		
		public List<Hotel> findHotelHongKong() {
			return hongKongH;
		}
		
		public List<Hotel> findHotelShangai() {
			return shangaiH;
		}
	    

	    public List<Hotel> getPekinH() {
	        return pekinH;
	    }
	    
	    public List<Hotel> getHongKongH() {
	        return hongKongH;
	    }
	    
	    public List<Hotel> getShangaiH() {
	        return shangaiH;
	    }
	    
	    
	    
	    //THAILANDE
	    public List<Hotel> findHotelBangkok() {
			return bangkokH;
		}
		
		public List<Hotel> findHotelPhuket() {
			return phuketH;
		}
		
		public List<Hotel> findHotelChiangRai() {
			return chiangRaiH;
		}
	    

	    public List<Hotel> getBangkokH() {
	        return bangkokH;
	    }
	    
	    public List<Hotel> getPhuketH() {
	        return phuketH;
	    }
	    
	    public List<Hotel> getChiangRaiH() {
	        return chiangRaiH;
	    }
	    
 
	}
