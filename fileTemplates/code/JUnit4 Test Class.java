import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith( MockitoJUnitRunner.class )
public class ${NAME} {

  @Test
  public void shouldSetUpProperly(){}

  ${BODY}
}
