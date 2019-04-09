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
					"Le Daiwa Roynet Hotel Nishi-Shinjuku propose un h�bergement 3 �toiles avec un salon commun � Tokyo. Bien situ� dans le district de Shinjuku, l'�tablissement se trouve � 2,1 km du jardin imp�rial de Shinjuku et � 2,4 km du sanctuaire Meiji Jingu. "
					+ "Vous serez aussi � 3,3 km du stade Meiji Jingu et du NHK Studio Park. Les logements sont �quip�s d'une t�l�vision � �cran plat, d'une salle de bains privative avec une baignoire et d'un r�frig�rateur. "
					+ "Lors de votre s�jour au Daiwa Roynet Hotel Nishi-Shinjuku, vous pourrez savourer un petit-d�jeuner buffet. Le personnel de la r�ception ouverte 24h/24 parle japonais et anglais. Le centre-ville de Shibuya se trouve � 4 km de l'h�bergement, "
					+ "tandis que la statue de Hachiko est � 4 km. L'a�roport international de Tokyo-Haneda est � 23 km. Ce quartier (Arrondissement de Shinjuku) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : "
					+ "le shopping, les habitants chaleureux et la nourriture. Les couples appr�cient particuli�rement l'emplacement de cet �tablissement."));
	        
	        tokyoH.add(new Hotel(i++, "tokyo2","Super Hotel Lohas Akasaka", "Minato-ku Akasaka, Tokyo", "01 06 07 08 09", "Lohas-Akasaka@hotel.com", 125, 5, 
					"Ouvert en mars 2015, le Super Hotel Lohas Akasaka est id�alement situ� dans le centre de Tokyo, � seulement 4 minutes � pied de la station de m�tro Akasaka. Cet �tablissement non-fumeurs dispose de bains publics spacieux et d'une connexion Wi-Fi gratuite."
					+ "Toutes les chambres du Super Hotel Lohas Akasaka sont �quip�es d'installations modernes telles qu'une t�l�vision � �cran plat de 81 cm, des films � la carte et un purificateur/humidificateur d'air. Leur salle de bains privative est pourvue d'une baignoire, d'un s�che-cheveux et d'articles de toilette gratuits. Un �tage est r�serv� aux femmes."
					+ "D'autre part, le Super Hotel Lohas Akasaka poss�de une laverie automatique et des ordinateurs avec connexion Internet dans les parties communes. Vous trouverez par ailleurs des distributeurs automatiques de boissons sur place."
					+ "Vous rejoindrez plusieurs stations de m�tro telles qu'Akasaka Mitsuke, Nagatacho et Tameike Sanno en moins de 10 minutes de marche. D'autre part, les quartiers populaires de Shibuya et Ginza sont accessibles en moins de 10 minutes de m�tro � partir de la station d'Akasaka."
					+ "Enfin, un petit-d�jeuner simple est servi dans la salle � manger, au deuxi�me �tage."
					+ "Ce quartier (Arrondissement de Minato) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : des rues propres, les habitants chaleureux et la culture."));
	        
	        osakaH = new ArrayList<Hotel>();
	        
	        osakaH.add(new Hotel(i++, "osaka1", "Hotel Keihan Universal Tower", "Konohana-ku Shimaya, Osaka", "01 10 11 12 13", "Keihan-Universal@hotel.com", 85, 4, 
					"L'Hotel Keihan Universal Tower vous accueille � 300 m�tres du parc � th�me Universal Studios Japan. Vous y trouverez le spa S-PARK, au 31�me �tage, avec sauna, jacuzzi et bains thermaux offrant une vue sur la ville. Vous b�n�ficierez gratuitement d'une connexion Wi-Fi dans l'ensemble des locaux."
					+ "Les chambres de l'Hotel Keihan Universal Tower poss�dent une grande fen�tre et sont d�cor�es dans tons neutres, rehauss�s par des boiseries. Toutes sont dot�es d'une t�l�vision � �cran plat de 94 cm. Leur salle de bains privative est pourvue d'une baignoire, d'articles de toilette, d'une brosse � dents, d'un s�che-cheveux et de chaussons."
					+ "Des services de massage, de change et de bagagerie sont disponibles � la r�ception ouverte 24h/24."
					+ "Le restaurant Garden propose un buffet toute la journ�e compos� de plats japonais et occidentaux. Surplombant les toits d'Osaka depuis le 32�me �tage, le Top of Universal sert des plats pour le d�ner."
					+ "L'h�tel se trouve � 1h10 en bus limousine de l'a�roport de Kansai et � 45 minutes en bus express de celui d'Itami. Vous rejoindrez la gare JR d'Osaka en 15 minutes en train."));
	        
	        osakaH.add(new Hotel(i++, "osaka2", "The Park Front Hotel at Universal Studios Japan TM", "Konohana-ku, Osaka", "01 14 15 16 17", "Park-Front@hotel.com", 129, 4, 
					"Inaugur� le 1er ao�t 2015, le Park Front Hotel at Universal Studios Japan TM est l'�tablissement officiel Universal Studios Japan le plus r�cent. Il se trouve � quelques pas de l'entr�e du parc � th�mes, de la gare Universal City et du centre commercial Universal CityWalk Osaka�. Il dispose d'un parking priv�, de plusieurs caf�s, restaurants et boutiques sur place ainsi que d'une connexion Wi-Fi gratuite dans l'ensemble de ses locaux."
					+ "En train, la gare Universal City est � 12 minutes de celle d'Osaka (JR) et � 20 minutes de celle de Shin-Osaka (JR) desservie par les trains � grande vitesse. Le service de navette en bus-limousine depuis l'a�roport international d'Osaka vers l'�tablissement prend 45 minutes. Depuis celui du Kansai, il dure 1 heure et 10 minutes. En voiture, vous atteindrez Osaka en environ 20 minutes par l'autoroute Hanshin Expressway."
					+ "L'�tablissement propose une r�ception ouverte 24h/24, une bagagerie et des services de massage. Moyennant des frais suppl�mentaires, vous profiterez d'une laverie automatique au 2�me �tage. Sur place, vous b�n�ficierez �galement d'un caf�, d'une cr�perie, d'un bar de yaourt glac�, d'une pizzeria et d'une sup�rette."
					+ "Toutes les chambres sont munies d'un purificateur/humidificateur d'air, de la climatisation, d'une t�l�vision par satellite � �cran plat, d'un bureau, d'un coin salon ainsi que d'une salle de bains privative avec une baignoire, une douche, des chaussons, un s�che-cheveux et des articles de toilette gratuits. Les h�bergements insonoris�s incluent un r�frig�rateur et des casiers personnels."
					+ "Pr�sentant une d�coration sur le th�me hawa�en, le restaurant Buffet Dining Akala sur place sert un grand choix de plats internationaux, notamment chinois, occidentaux et japonais. Il est ouvert pour le petit-d�jeuner, le d�jeuner et le d�ner."));
	        
	        kyotoH = new ArrayList<Hotel>();
	        
	        kyotoH.add(new Hotel(i++, "kyoto1", "Kyoto Hana Hotel", "Higashiyama-ku, Kyoto", "01 18 19 20 21", "Kyoto-Hana@hotel.com", 127, 3, 
					"Situ� dans la rue Sanjo-kai, le Kyoto Hana Hotel se tient � seulement 1 minute � pied des stations de m�tro Sanjo et Sanjo-Keihan. Les quartiers populaires de Gion et de Ponto-cho vous attendent � tout juste 10 minutes � pied. Enti�rement non-fumeurs, cet �tablissement propose une connexion Wi-Fi gratuite dans l'ensemble des locaux et une r�ception ouverte 24h/24."
					+ "D�cor�es dans des tons naturels, les chambres climatis�es du Kyoto Hana Hotel sont dot�es d'une t�l�vision � �cran plat, d'un r�frig�rateur et d'une bouilloire �lectrique. Leur salle de bains privative est pourvue d'un s�che-cheveux et d'articles de toilette gratuits. Les serviettes sont fournies. Les femmes b�n�ficieront d'un d�maquillant, de lait de toilette et de bonnets de douche � l'arriv�e."
					+ "Deux ordinateurs portables sont disponibles gratuitement dans le hall. Le personnel du Kyoto Hana Hotel se fera un plaisir de vous aider � organiser vos visites des attractions locales et � r�server des restaurants."
					+ "Sur place, vous pourrez profiter d'un distributeur automatique de boissons. Un petit-d�jeuner buffet avec des viennoiseries danoises fra�chement sorties du four et des plats japonais sont servis dans le salon du rez-de-chauss�e. Dans les environs de l'h�tel, vous trouverez un �ventail de restaurants traditionnels et internationaux."
					+ "Le Hana Hotel est install� � 5 minutes de train du ch�teau de Nijojo. Accessible en 10 minutes � pied, la station Gion-Shijo est � proximit� de la rue Shijo o� vous d�couvrirez le quartier traditionnel des geishas. Le temple Honno-ji et le sanctuaire de Yasaka-jinja sont tous 2 � environ 15 minutes de marche de l'h�tel. Vous pourrez vous rendre au sanctuaire de Fushimi Inari-taisha en 20 minutes en train sur la ligne Keihan. En bus, vous rejoindrez le temple Kiyomizu-dera en 20 minutes et le temple Ginkaku-ji en 30 minutes."
					+ "Ce quartier (Higashiyama-ku) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : l'exploration de la vieille ville, la marche � pied et les monuments anciens."));
	        
	        kyotoH.add(new Hotel(i++, "kyoto2", "Hotel Keihan Kyoto Grande", "Minami-ku Higashikujyo, Kyoto", "01 22 23 24 25", "Keihan-Grande@hotel.com", 184, 5, 
					"L'Hotel Keihan Kyoto est directement reli� � la gare JR de Kyoto par un passage souterrain. Il propose des services de massage et une r�ception ouverte 24h/24. Ses chambres modernes b�n�ficient toutes d'une connexion Wi-Fi gratuite."
					+ "Les chambres sont �quip�es de la climatisation et du chauffage. Toutes comprennent une bouilloire �lectrique, un r�frig�rateur et une t�l�vision � �cran plat. Leur salle de bains privative est pourvue d'une baignoire et d'articles de toilette. Vous profiterez notamment d'une brosse � dents, d'un s�che-cheveux et de chaussons."
					+ "Le Kyoto Keihan Hotel se trouve � 10 minutes � pied du temple Higashi Hongan-ji et � 15 minutes de marche de celui de To-ji. Le bus-limousine rejoint l'a�roport international de Kansai en 2 heures et l'a�roport d'Itami en 1 heure, depuis un arr�t situ� juste en face de l'�tablissement."
					+ "Une bagagerie et un service de nettoyage � sec sont � votre disposition � la r�ception. Au restaurant Octavar, vous pourrez d�guster une cuisine m�diterran�enne accompagn�e de vins fins. Un distributeur automatique de boissons est en outre disponible sur place. Vous pourrez aussi consulter les guides de Kyoto dans les parties communes. Une machine d'�change de devises est install�e sur place."
					+ "Ce quartier (Minami Ward) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les temples, les visites et l'histoire."));
	    
	        
	        seoulH = new ArrayList<Hotel>();
            
            seoulH.add(new Hotel(i++, "seoul1", "L7 Hongdae by LOTTE", "HongDae, S�oul", "01 02 03 04 05", "Hongdae@hotel.com", 208, 4, 
            		"Situ� dans le quartier de Mapo-gu, � S�oul, le L7 Hongdae propose des chambres 4 �toiles dot�es d'une connexion Wi-Fi gratuite. Cet �tablissement comprend une salle de sport, un bar et un restaurant. "
            		+ "Toutes les chambres sont climatis�es et comprennent une t�l�vision par satellite � �cran plat, une bouilloire, un bidet, des articles de toilette gratuits et une armoire. Leur salle de bains privative est pourvue d�un s�che-cheveux. Toutes les chambres sont �galement �quip�es d'un r�frig�rateur. Un petit-d�jeuner � la carte est servi sur place. Cet h�tel comporte un centre d'affaires. Lors de votre s�jour au L7 Hongdae, vous pourrez profiter de la piscine sur le toit, accessible en saison, moyennant des frais suppl�mentaires. Le personnel de la r�ception ouverte 24h/24 parle anglais et japonais. Le centre commercial I'Park Mall se trouve � 5 km."
            		+ "Ce quartier (Mapo-gu) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les caf�s, les magasins de v�tements et les boutiques de maquillage."));
            
            seoulH.add(new Hotel(i++, "seoul2", "aFIRST Hotel Myeongdong", "Jung-gu, S�oul", "01 06 07 08 09", "Myeongdong@hotel.com", 80, 4,
            		"Situ� � 4 minutes � pied de la sortie 1 de la station de m�tro Euljiro 1-GA (ligne 2), l��tablissement a First Myeongdong se trouve � 5 minutes de l�h�tel de ville de S�oul. Vous b�n�ficierez gratuitement d�une connexion Wi-Fi et d�un parking priv� sur place. Toutes les chambres disposent d�une t�l�vision � �cran plat, d�un minibar, d�une bouilloire �lectrique, d�un r�frig�rateur, d�un coffre-fort, d�un bureau, d�un canap�, de moquette et de la climatisation. Les salles de bains comprennent des toilettes avec un bidet �lectronique, un s�che-cheveux, un peignoir et des Articles de toilette gratuits. "
            		+ "La r�ception ouverte 24h/24 assure des services de bagagerie, de change et de concierge. Un centre de remise en forme et une salle de conf�rence sont �galement � votre disposition. Le restaurant sur place sert un petit-d�jeuner continental et un menu � la carte pour le d�jeuner et le d�ner. Le c�l�bre Palais Deoksugung se trouve � 9 minutes � pied et le Palais Gyeongbokgung est � 19 minutes � pied de l�A First Myeongdong. L�a�roport international de Gimpo est � 42 minutes en voiture et l�a�roport d�Incheon est � 63 minutes en voiture. "
            		+ "Ce quartier (Jung-gu) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les boutiques de maquillage, le shopping et les magasins de v�tements.<"));
            
            busanH = new ArrayList<Hotel>();
            
            busanH.add(new Hotel(i++, "busan1", "Hilton Busan", "Gijang-Gun, Busan", "01 10 11 12 13", "Hilton-Busan@hotel.com", 162, 5,
            		"Install� � Busan, � 6 km de la colline de Dalmaji, le Hilton Busan comprend des installations de sports nautiques, une salle de sport, un jardin, une terrasse et un restaurant servant des grillades pr�par�es sur le barbecue et des plats chinois. Il assure aussi un service de navette gratuit. Tous les logements du Hilton Busan incluent un coin salon, une t�l�vision par c�ble � �cran plat, une salle de bains privative, la climatisation et un bureau. "
            		+ "Certains disposent d'un balcon. Chaque matin, l'�tablissement pr�pare un petit-d�jeuner buffet. Dans les environs du Hilton Busan, vous pourrez pratiquer la randonn�e. Parlant anglais et japonais, le personnel de la r�ception vous aidera � organiser votre s�jour. La plage de Haeundae et l'aquarium Sea Life Busan sont � 8 km. "
            		+ "Ce quartier (Gijang-Gun) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les balades le long de la c�te, la relaxation et les balades sur la plage."));
            
            busanH.add(new Hotel(i++, "busan2", "Hotel Kyungsung", "Busanjin-Gu, Busan,", "01 14 15 16 17", "Kyungsung@hotel.com", 130, 4,
            		"Dot� d�une connexion Wi-Fi gratuite, l�Hotel Kyungsung propose des chambres � Busan, � 500 m�tres du march� de Bujeon et � 700 m�tres de la rue m�dicale Seomyeon. Cet h�tel 3 �toiles dispose d�une r�ception ouverte 24h/24 et d�un centre d�affaires. L��tablissement est situ� dans le quartier Busanjin-Gu, � 700 m�tres de Seomyeon. Les logements de l�h�tel sont �quip�s d�un coin salon. Toutes les chambres sont �quip�es de la climatisation et certaines poss�dent �galement une terrasse. Tous les logements comprennent un r�frig�rateur. "
            		+ "Le petit-d�jeuner est servi le week-end � l�Hotel Kyungsung. L��tablissement propose �galement des installations d�affaires telles qu�un fax et une photocopie. L�Universit� Kyungsung est � 4,3 km de l�Hotel Kyungsung."
            		+ "Ce quartier (Busanjin-gu) est un choix id�al pour les voyageurs qui s�int�ressent � ces th�mes: les habitants chaleureux, le shopping et la nature."));
            					
            jejuH = new ArrayList<Hotel>();
            
            jejuH.add(new Hotel(i++, "jeju1", "The Shilla Jeju", "Jungmun Beach, Seogwipo", "01 18 19 20 21", "Shilla-Jeju@hotel.com", 266, 5,
            		"L'�tablissement The Shilla Jeju est situ� � 10 minutes � pied de la c�l�bre plage de Jungmun. Il propose 6 restaurants, un club de sport enti�rement �quip� avec 2 piscines thermales et un sauna, ainsi qu'un spa de luxe et un centre d'affaires dot� d'une connexion Wi-Fi gratuite. Les chambres climatis�es offrent une vue sur le mont Halla ou l'oc�an. Chacune est �quip�e d'une t�l�vision par c�ble � �cran plat, d'un minibar et d'un coffre-fort. Lors de votre s�jour, vous disposerez de piscines int�rieure et ext�rieure, ainsi que d'un jacuzzi dans le club de sport, ouvert gratuitement toute l'ann�e. "
            		+ "Les plus jeunes b�n�ficieront gratuitement d'une salle de jeux pour enfants et un service de pr�t de poussettes est aussi assur�. Les personnes avec un passeport international profiteront d'un casino sur place. De plus, The Shilla Jeju est dot� d'un parking gratuit. Par ailleurs, le restaurant Cheonjee vous servira des mets cor�ens raffin�s et des plats de Jeju uniques, tandis que le restaurant Hinode au 3�me �tage pr�pare une cuisine japonaise traditionnelle. Vous aurez �galement la possibilit� de d�guster un buffet tout au long de la journ�e au restaurant Park View. "
            		+ "Enfin, l'h�tel The Shilla Jeju se trouve � 10 minutes en voiture du jardin botanique Yeomiji et � 50 minutes de route de l'a�roport international de Jeju."
            		+ "Ce quartier (Jungmun Beach) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les mus�es, la relaxation et la plage."));
            
            jejuH.add(new Hotel(i++, "jeju2", "Lotte Hotel Jeju", "Jungmungwangwang-ro, Seogwipo", "01 22 23 24 25", "Jeju-Lotte@hotel.com", 228, 5,
            		"Situ� sur l'�le de Jeju, le Lotte Hotel Jeju dispose d'un complexe de divertissement comprenant un casino. Il propose de spacieux h�bergements dot�s d'un balcon avec vue sur la nature environnante. Un parking gratuit est disponible. Les chambres disposent d'une t�l�vision par c�ble � �cran plat, Elles comportent aussi un minibar, un plateau/bouilloire et un coffre-fort. Vous profiterez d'une vue sur l'oc�an ou sur la montagne. "
            		+ "Des bouteilles d'eau gratuites, des peignoirs et des chaussons sont �galement fournis. L'�tablissement compte des piscines int�rieure et ext�rieure, ainsi qu'un jacuzzi dans la salle de sport accessibles gratuitement pendant votre s�jour. Les enfants pourront profiter de toute une vari�t� d'activit�s int�rieures ou ext�rieures, et notamment d'un bassin pour enfants et d'une salle de jeux. De plus, un service de pr�t de poussettes est assur�. Le restaurant en plein air Lake Plaza sert un buffet international. L'�tablissement poss�de 6 autres restaurants, tels que le Mu Gung Hwa qui sert des plats cor�ens et le Momoyama qui propose des plats japonais et chinois. "
            		+ "Le Lotte Hotel Jeju se trouve � 400 m�tres du mus�e de l'ours en peluche. La plage de Jungmun Saekdal se tient � 10 minutes � pied de l'h�tel. Vous rejoindrez l'a�roport international de Jeju en 50 minutes de route."
            		+ "Ce quartier (Jungmun Beach) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les mus�es, la relaxation et la plage."));
            
            
            pekinH = new ArrayList<Hotel>();
            
            pekinH.add(new Hotel(i++, "pekin1", "Beijing Prime Hotel Wangfujing", "Dongcheng, P�kin", "01 02 03 04 05", "Bejin-Wangfujing@hotel.com ", 177, 4,
            		"Situ� sur la rue Wangfujing, le Beijing Prime Hotel Wangfujing dispose de 5 restaurants, d'une piscine int�rieure et d'un parking gratuit. Ses chambres b�n�ficient d'une connexion Wi-Fi gratuite et d'une vue sur la ville. Vous s�journerez � 5 minutes � pied du centre culturel Jiade et du mus�e d'Art national de Chine. La station de m�tro Dongsi (lignes 5 et 6) est � environ 8 minutes de marche. En voiture, le Prime Hotel se trouve � 5 minutes de la Cit� interdite, � 8 minutes de la place Tian'anmen et du mus�e national de Chine, � 11 minutes du parc Beihai et � 45 minutes de l'a�roport international Beijing Capital. La gare ferroviaire de P�kin est � environ 15 minutes de route. Les chambres du Prime sont �quip�es de la climatisation et du chauffage. Chacune comprend une t�l�vision par c�ble � �cran plat, un coffre-fort et un s�che-cheveux. Un minibar et un plateau/bouilloire sont �galement fournis. Le restaurant de l'h�tel, l'Emperor, vous propose une cuisine locale dans un cadre inspir� de la Cit� interdite. Le restaurant-grill Elysee sert des plats fran�ais. Vous pourrez aussi d�guster des sp�cialit�s internationales au caf� et prendre un verre dans l'un des bars de l'h�tel. L'Hotel Prime poss�de une salle de sport et un institut de beaut�. Vous pourrez profiter du sauna ou vous d�tendre avec un massage au spa. Rendez-vous au karaok� de l'h�tel pour chanter sans mod�ration ou au bureau d'excursions situ� dans le hall pour organiser vos d�placements. Un service de location de v�los est �galement disponible pour partir � la d�couverte des environs."
            		+ "Ce quartier (Dongcheng) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les monuments, les visites et les temples."));
            
            pekinH.add(new Hotel(i++, "pekin2", "New World Beijing Hotel", "adresse2", "01 06 07 08 09", "NeW-Beijing@hotel.com", 188, 5,
            		"Situ� � environ 15 minutes � pied du temple du Ciel, le New World Beijing Hotel propose des chambres avec connexion Wi-Fi. Il poss�de une piscine int�rieure, un centre de spa, une salle de sport ainsi qu'un centre d'affaires avec des salles de r�union et de banquet. Vous s�journerez � 8 minutes de route de la place Tian'anmen et � 10 minutes � pied de la station de m�tro Chongwenmen (lignes 2 et 5). En voiture, vous rejoindrez la gare de P�kin en 10 minutes, l'a�roport international de la ville en environ 45 minutes et la c�l�bre rue des bars de Sanlitun en 22 minutes. Donnant sur la ville, les chambres poss�dent une t�l�vision par satellite � �cran plat, une station d'accueil pour iPod, un coffre-fort, du mat�riel de repassage, un bureau et un coin salon dot� d'un canap�. Leur salle de bains privative est pourvue d'une baignoire, d'une douche et de peignoirs moelleux. Vous b�n�ficierez d'un sauna, de massages apaisants, d'une salle de sport et d'une piscine int�rieure. Pour davantage de confort, des services de change, de concierge et de bagagerie sont dispens�s. Le bureau d'excursions assure un service de location de voitures et de billetterie. L'�tablissement comporte 2 restaurants. Le Tian Tan Kitchen sert un buffet tout au long de la journ�e, tandis que le No.8 Qi Nian pr�pare une cuisine cantonaise et des mets typiques du Sichuan. Vous appr�cierez aussi des rafra�chissements au bar YIN on 12, install� sur le toit. Pour une exp�rience gastronomique maximale � P�kin, vous trouverez une vari�t� de restaurants locaux � quelques minutes de marche."
            		+ "Ce quartier (Dongcheng) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : les monuments, les visites et les temples."));
            
            hongKongH = new ArrayList<Hotel>();
            
            hongKongH.add(new Hotel(i++, "hongKong1", "Hotel Tsim Sha Tsui", "Tsim Sha Tsui Kowloon, Hong Kong", "01 10 11 12 13", "Tsim-Sha-Tsui@hotel.com", 212, 5,
            		"Situ� ans le quartier de Tsim Sha Tsui � Hong Kong, � 600 m�tres du centre commercial Mira Place 1, le Page148 Boutique Hotel Tsim Sha Tsui propose des chambres climatis�es, une r�ception ouverte 24h/24, un service de concierge ainsi qu'un restaurant. Toutes les chambres sont �quip�es d'une t�l�vision par satellite � �cran plat, d'un r�frig�rateur, d'une bouilloire et d'une armoire. Elles comprennent aussi une salle de bains privative pourvue d'une douche et d'articles de toilette gratuits, une vue sur le jardin et un coin salon. Le Mira Place 2 est � 600 m�tres du Page148, tandis que Kowloon Park se trouve � 1,1 km. Vous s�journerez � 5 minutes � pied de la sortie D de la station de m�tro Jordan. "
            		+ "Ce quartier (Tsim Sha Tsui) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : le shopping de luxe, le shopping et les magasins de v�tements."));
           
            hongKongH.add(new Hotel(i++, "hongKong2", "Island Shangri-La Hong Kong", "Suprem Court road, Hong Kong", "01 14 15 16 17", "Shangri-La@hotel.com", 334, 5,
            		"Haut de 56 �tages qui dominent le complexe commercial Pacific Place � Central, l'Island Shangri-La Hong Kong propose des h�bergements luxueux, un restaurant �toil� au guide Michelin, un spa, une piscine ext�rieure et une salle de sport ouverte 24h/24. �l�gamment d�cor�es avec un mobilier de style oriental, les chambres sont spacieuses. Elles sont dot�es de baies vitr�es donnant sur le Victoria Peak et le port. Elles sont toutes �quip�es d'une connexion Wi-Fi gratuite, d'une t�l�vision � �cran plat et d'un minibar. Un service de majordome est assur� 24h/24. Lors de votre s�jour, vous pourrez profiter de cours de hatha yoga, d'une piscine ext�rieure et de massages relaxants au centre de bien-�tre du Island Shangri-La. Des services de blanchisserie et de limousine sont disponibles. Les restaurants prim�s de l'Island Shangri-La comprennent un restaurant �toil� au guide Michelin, le Summer Palace Cantonese. "
            		+ "Ce quartier (Centre de Hong Kong) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : la vie nocturne, les restaurants et la gastronomie."
            		+ "Ce quartier est aussi id�al pour le shopping, avec des magasins c�l�bres comme : Cartier, Gucci, Tiffany & Co, Herm�s, Chanel."));
            
            shangaiH = new ArrayList<Hotel>();
            
            shangaiH.add(new Hotel(i++, "shangai1", "The Sukhothai Shanghai", "Jing'an, Shanghai", "01 18 19 20 21", "Sukhothai@hotel.com", 212, 5,
            		"L'�tablissement The Sukhothai Shanghai est situ� � Shanghai, � 1,2 km de la place du Peuple. Install� � proximit� des attractions telles que la rue pi�tonne East Nanjing Road, il propose une r�ception ouverte 24h/24, un service de concierge, une salle de sport, un bar et un restaurant. Toutes les chambres comprennent la climatisation, une connexion Wi-Fi gratuite, une t�l�vision par satellite � �cran plat, un bureau, un coin salon, un r�frig�rateur et une machine � caf�. Leur salle de bains privative est pourvue d'un jacuzzi, d'une baignoire, d'un s�che-cheveux et d'articles de toilette gratuits. Certaines chambres offrent une vue sur la ville. Pendant votre s�jour, vous disposerez d'une salle de sport ouverte 24h/24, ainsi que d'options de restauration au rez-de-chauss�e, notamment le caf� URBAN, le salon URBAN et le restaurant italien La Scala. Chaque matin, vous pourrez d�guster un petit-d�jeuner buffet ou continental sur place. Enfin, l'�tablissement The Sukhothai Shanghai se trouve � 1,4 km du quartier de Xintiandi et � 13 km de l'a�roport international de Shanghai Hongqiao, le plus proche."
            		+ "Ce quartier (Jing'an) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : la vie nocturne, la nourriture et les affaires."));
            
            shangaiH.add(new Hotel(i++, "shangai2", "Hyatt Regency Shanghai Global Harbor", "Ningxia Road Putuo District, Shanghai", "01 22 23 24 25", "Hyatt-Regency@hotel.com", 117, 4,
            		"Le Hyatt Regency Shanghai Global Harbour est int�gr� dans l'un des plus grands centres commerciaux et de divertissement de Shanghai, Global Harbour. Il dispose d'une piscine int�rieure et d'un centre de spa et de bien-�tre. Une connexion Wi-Fi est disponible gratuitement dans l'ensemble des locaux. L'h�tel b�n�ficie d'un acc�s direct � la station de m�tro Jinshajiang Road, desservie par les lignes 3, 4 et 13 qui permettent de se d�placer facilement dans Shanghai. Le parc Zhongshan et le parc aquatique Changfeng Ocean World vous attendent � environ 10 minutes en voiture. Le zoo de Shanghai et le temple Jing'an sont accessibles en 20 minutes de route. L'a�roport international de Shanghai Hongqiao, le plus proche, se trouve � environ 30 minutes en voiture de l'�tablissement. Chaque logement est bien �quip� avec la climatisation, une t�l�vision � �cran LED de 165 cm et une cha�ne hi-fi Bluetooth. Toutes les chambres offrent une vue sur la ville. Des peignoirs, des chaussons et des articles de toilette gratuits sont fournis pour votre confort dans la salle de bains privative. L'�tablissement met � disposition 2 600 m� de salles de r�union et de r�ception, dont la Regency Ballroom, une salle de 900 m� avec jardin sur le toit et salles de r�union polyvalentes. Vous pourrez faire de l'exercice dans la salle de sport ouverte 24h/24, vous relaxer dans la piscine ou vous d�tendre dans le centre de spa. Vous trouverez 4 restaurants et un salon sur place. Le restaurant chinois Xiang Yue sert une authentique cuisine locale de Jiangnan, et vous pourrez d�guster des plats de saison du monde entier au Market Caf�. Le bar sur le toit avec ses terrasses panoramiques est un lieu recherch� pour appr�cier des vins fins, des cocktails et des boissons. Un petit-d�jeuner buffet est servi tous les matins."
            		+ "Ce quartier (Putuo) est un choix id�al pour les voyageurs qui s'int�ressent � ces th�mes : la vie nocturne, les panoramas urbains et les balades en ville."));
            
            
            bangkokH = new ArrayList<Hotel>();
            
            bangkokH.add(new Hotel(i++, "bangkok1", "Praya Palazzo ", "Bangyeekhan, Bangkok", "01 02 03 04 05", "Praya-Palazzo@hotel.com", 97, 5,
            		"Description de l�h�tel : D�inspiration architecturale italienne, cet h�tel poss�de des chambres spacieuses et d�cor�es � l�anciennes avec beaucoup de charme. Vous profiterez en famille d�une tr�s belle piscine situ�e le long du fleuve."
            		+ "Les plus : Wi FI gratuit. Parking gratuit."
            		+ "Les alentours : Id�alement situ�, au calme. Vous n�aurez pas l�impression d��tre en plein Bangkok mais juste totalement hors du temps� En plein quartier ancien et typique. Le Praya Palazzo est uniquement accessible par le fleuve."));
            
            bangkokH.add(new Hotel(i++, "bangkok2", "Hotel Clover Asoke", "Khlong Toei, Bangkok", "01 06 07 08 09", "Clover-Asoke@hotel.com", 84, 4,
            		"Description de l�h�tel : Id�al en  famille, joliment d�cor�s, les appartements ind�pendants du Shama Sukhumvit sont immenses, tr�s bien �quip�s. La literie est exceptionnelle. Il y a une salle de jeu pour enfants. Le personnel est top. La piscine � d�bordement  en �tage est superbe. L�h�tel propose �galement un billard et un mini-golf. Il y a m�me des cours de yoga pour se d�tendre apr�s la visite de la ville."
            		+ "Les plus : Wi Fi gratuit. Parking Gratuit. Garde d�enfants."
            		+ "Les alentours : Le Shama Sukhumvit Serviced Apartments se trouve � 5 minutes � pied de la station de m�tro a�rien BTS Ploen Chit. Il est tr�s bien  situ�. Bangkok quartier moderne �et authentique � la fois!"));
            
            phuketH = new ArrayList<Hotel>();
            
            phuketH.add(new Hotel(i++, "phuket1", "Naiharn Garden Villa", "Nai Harn Beach, Muang Phuket", "01 10 11 12 13", "Naiharn-Garden@hotel.com", 101, 5,
            		"Description de l�h�tel : Superbes villas priv�es, Vous aurez le choix entre des villas d�une, de deux ou de trois chambres. Elles sont enti�rement meubl�es et disposent de la climatisation. Elles comprennent �galement un salon, un espace d�tente ext�rieur . Chacune dot�e de sa propre piscine et jardin. Id�ale en famille."
            		+ "Les plus : Navette gratuite. Service garde d�enfants. Wi Fi gratuit."));
            
            phuketH.add(new Hotel(i++, "phuket2", "Baan Malinee", "Soi Baan Bangjo Bang, Phuket", "01 14 15 16 17", "Baan-Malinee@hotel.com", 90, 4,
            		"Des bungalows charmants nich�s en plein jardin tropical. Le petit d�jeuner est d�licieux�Les chambres sont d�cor�s avec go�t et la piscine est chouette !"));
            
            chiangRaiH = new ArrayList<Hotel>();
            
            chiangRaiH.add(new Hotel(i++, "chiangRai1", "The Legend Chiang Rai Boutique River Resort & Spa", "A.Muang, Chiang Rai,", "01 18 19 20 21", "Legend-ChiangRai@hotel.com", 83, 5,
            		"Description de l�h�tel : Cet h�tel est splendide. Architecture Tha�landaise tr�s raffin�e. Vous y serez bien en famille avec des chambres spacieuses  comprenant un grand salon avec vue sur le fleuve ou le jardin. Les douches ext�rieures sont en pierre naturelle. Piscine � d�bordement."
            		+ "Les plus : services de location de v�los et de voitures � disposition. Wi Fi gratuit."
            		+ "Les alentours : Cet h�tel est  id�alement situ� au bord de la rivi�re Mae Kok. La ville de Chiang Rai et le club de golf de Mae Kok sont situ�s � moins de 2 km du Legend Chiang Rai Resort."));
            
            chiangRaiH.add(new Hotel(i++, "chiangRai2", "Banlomnov", "Robwiang Muang, Chiang Rai, ", "01 22 23 24 25", "Banlomnov@hotel.com", 31, 3,
            		"Description :  Chambres spacieuses dot�es d�un coin salon. Tr�s propres et tout confort."
            		+ "Les plus : Location de v�los. Parking gratuit. Une navette a�roport peut aussi �tre organis�e sur demande."
            		+ "Les alentours : Au calme. Le Banlomnow se trouve � 500 m�tres du Central Plaza Chiang Rai."));
    
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
